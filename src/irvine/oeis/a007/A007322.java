package irvine.oeis.a007;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000670;

/**
 * A007322.
 * @author Sean A. Irvine
 */
public class A007322 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final A000670 a670 = new A000670();
    a670.next();
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Stirling.firstKind(mN + 1, k + 1).multiply(a670.next().square()));
    }
    return sum.divide(mF);
  }
}
