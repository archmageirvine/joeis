package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007543 Frequency of n-th largest distance in N times N grid, N &gt; n.
 * @author Sean A. Irvine
 */
public class A007543 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n = ++mN;
    final long s = Functions.SQRT.l(n);
    if (s * s == mN) {
      return Z.valueOf(2 * mN);
    } else {
      final long u = Functions.SQRT.l(4 * mN);
      final long f = u * u / 4;
      return Z.FOUR.multiply(mN - f).multiply(Functions.SQRT.l(4 * mN) + 1 - mN + f);
    }
  }
}
