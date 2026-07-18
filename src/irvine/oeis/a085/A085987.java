package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A085987 Product of exactly four primes, three of which are distinct (p^2*q*r).
 * @author Sean A. Irvine
 */
public class A085987 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A085987() {
    super(1, 1, 1, 1, (i, j, k) -> Functions.PRIME.z(i).square().multiply(Functions.PRIME.l(j)).multiply(Functions.PRIME.l(k)));
  }

  @Override
  protected boolean accept(final long i, final long j, final long k, final Z n, final Z prev) {
    return i != j && i != k && j != k && !n.equals(prev);
  }
}
