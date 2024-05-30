package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069971 Table by antidiagonals of variance of time for a random walk starting at 0 to reach one of the boundaries at +n or -k for the first time.
 * @author Sean A. Irvine
 */
public class A069971 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    if (n == 0 || k == 0) {
      return Z.ZERO;
    }
    return Z.valueOf(n).multiply(k).multiply(n * n + k * k - 2).divide(3);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}

