package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063711 Table of bits required for product of n- and k-bit nonnegative numbers read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A063711 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return n <= 1 || m <= 1 ? Z.valueOf(n * m) : Z.valueOf(n + m);
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

