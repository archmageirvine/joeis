package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023396 If any odd power of 2 ends with k 1's and 2's, they must be the first k terms of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023396 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
      return Z.ONE;
    } else {
      mA = mS.multiply2().add(mA);
      return Z.TWO;
    }
  }
}
