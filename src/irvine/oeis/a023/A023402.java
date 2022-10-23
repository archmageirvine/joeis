package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023402 If any power of 2 ends with k 3's and 4's, they must be the first k terms of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023402 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(3).add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
      return Z.THREE;
    } else {
      mA = mS.multiply(4).add(mA);
      return Z.FOUR;
    }
  }
}
