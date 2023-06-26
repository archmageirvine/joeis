package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236469 Primes p such that pi(p) = floor(p/10), where pi is the prime counting function.
 * @author Georg Fischer
 */
public class A236469 extends FiniteSequence {

  /** Construct the sequence. */
  public A236469() {
    super(1, FINITE, 64553, 64567, 64577, 64591, 64601, 64661);
  }
}
