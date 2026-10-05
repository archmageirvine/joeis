package irvine.oeis.a258;
// manually 2026-10-04

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A258851 The pi-based arithmetic derivative of n: a(p) = pi(p) for p prime, a(u*v) = a(u)*v + u*a(v), where pi = A000720.
 * @author Georg Fischer
 */
public class A258851 extends AbstractSequence implements DirectSequence {

  private long mN;

  /** Construct the sequence. */
  public A258851() {
    super(0);
    mN = -1L;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final long n) {
    return (n <= 1) ? Z.ZERO : FactorUtils.iterate(n, new Q(0), (x, p, e) -> x.add(new Q(Functions.PRIME_PI.z(p).multiply(e), p))).multiply(n).num();
  }

  @Override
  public Z a(final Z n) {
    return (n.compareTo(Z.ONE) <= 0) ? Z.ZERO : FactorUtils.iterate(n, new Q(0), (x, p, e) -> x.add(new Q(Functions.PRIME_PI.z(p).multiply(e), p))).multiply(n).num();
  }

}
