package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023404 If any power of 2 ends with k 4's and 7's, they must be the first k terms of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023404 implements Sequence {

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
      mA = mS.multiply(7).add(mA);
      return Z.SEVEN;
    }
  }
}
