package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023410 In base 10, if any power of 2 ends with k 6's and 9's, they must be the first k elements of this sequence in reverse order.
 * @author Sean A. Irvine
 */
public class A023410 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(6).add(mA);
    if (a.mod(mT).isZero()) {
      mA = a;
      return Z.SIX;
    } else {
      mA = mS.multiply(9).add(mA);
      return Z.NINE;
    }
  }
}
