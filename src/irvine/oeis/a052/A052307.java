package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A052307 Triangle read by rows: T(n,k) = number of bracelets (reversible necklaces) with n beads, k of which are black and n - k are white.
 * @author Sean A. Irvine
 */
public class A052307 extends AbstractSequence {

  private long mN = -1;
  private long mM = 0;

  protected A052307(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A052307() {
    this(0);
  }

  protected Z t(final long n, final long m) {
    if (m == 0 || m == n) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(Functions.GCD.l(n, m)).divisors()) {
      final long dd = d.longValue();
      sum = sum.add(Functions.PHI.z(d).multiply(Binomial.binomial(n / dd - 1, m / dd - 1)));
    }
    return sum.divide(m).add(Binomial.binomial((n - (m & 1)) / 2, m / 2)).divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
