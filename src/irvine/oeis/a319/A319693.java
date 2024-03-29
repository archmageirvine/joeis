package irvine.oeis.a319;
// Generated by gen_seq4.pl rgsman/rgs1 at 2023-10-24 21:37

import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A319693 Filter sequence combining sopfr(d) from all proper divisors d of n, where sopfr(d) is A001414(d) = sum of primes dividing d with repetition.
 * @author Georg Fischer
 */
public class A319693 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A319693() {
    super(1, new A319692());
  }
}
