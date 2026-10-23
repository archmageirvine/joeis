package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A086983 Primes of the form 2^r*p^s - 1, where p is an odd prime.
 * @author Sean A. Irvine
 */
public class A086983 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A086983() {
    super(1, 0, 1, 1, (r, p, s) -> Functions.PRIME.z(p).pow(s).shiftLeft(r).subtract(1));
  }

  @Override
  protected boolean accept(final long x, final long y, final long z, final Z n, final Z prev) {
    return super.accept(x, y, z, n, prev) && n.isProbablePrime();
  }
}
