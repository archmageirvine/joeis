package irvine.oeis.a061;
// manually 2025-04-01 direct

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A061395 Let p be the largest prime factor of n; if p is the k-th prime then set a(n) = k; a(1) = 0 by convention.
 * @author Georg Fischer
 */
public class A061395 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A061395() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIME_PI.z(Functions.GPF.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIME_PI.z(Functions.GPF.z(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
