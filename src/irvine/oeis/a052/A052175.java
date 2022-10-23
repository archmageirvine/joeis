package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052175 Triangle of numbers arising in enumeration of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A052175 extends Sequence0 {

  private long mN = 0;
  private long mM = 1;

  protected Z t(final long n, final long s) {
    Z s0 = Z.ZERO;
    for (long k = s; k <= n - s; ++k) {
      s0 = s0.add(Binomial.binomial(n, k));
    }
    Z s1 = Z.ZERO;
    for (long k = s + 1; k <= n - s + 1; ++k) {
      s1 = s1.add(Binomial.binomial(n + 2, k));
    }
    return s0.multiply(Binomial.binomial(n + 2, s)).subtract(s1.multiply(Binomial.binomial(n, s - 1)));
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN / 2;
    }
    return t(mN, mM);
  }
}
