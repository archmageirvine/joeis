package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034261.
 * @author Sean A. Irvine
 */
public class A034261 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected Z f(final long n, final long m) {
    return Binomial.binomial(n + m, m + 1).multiply(n * m + n + 1).divide(m + 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return f(mM, mN - mM);
  }
}

