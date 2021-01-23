package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023403 If any power of 2 ends with k 4's and 5's, they must be the first k elements of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023403 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(4).add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
      return Z.FOUR;
    } else {
      mA = mS.multiply(5).add(mA);
      return Z.FIVE;
    }
  }
}
