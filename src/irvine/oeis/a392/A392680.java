package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A392680 Primes which can be written as 2^a + p^b where a &gt; 1, p is an odd prime and b &gt; 1 is odd.
 * @author Sean A. Irvine
 */
public class A392680 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A392680() {
    super(1, 2, 2, 1, (a, k, b) -> Functions.PRIME.z(k).pow(2 * b + 1).add(Z.ONE.shiftLeft(a)));
  }

  @Override
  protected boolean accept(final long x, final long y, final long z, final Z n, final Z prev) {
    return !n.equals(prev) && n.isProbablePrime();
  }
}
