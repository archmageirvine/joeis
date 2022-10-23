package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023415 If any power of 2 ends with k 8's and 9's, they must be the first k terms of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023415 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(8).add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
      return Z.EIGHT;
    } else {
      mA = mS.multiply(9).add(mA);
      return Z.NINE;
    }
  }
}
