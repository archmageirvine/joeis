package irvine.oeis.a071;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A071151 Primes which are the sum of the first k odd primes for some k.
 * @author Sean A. Irvine
 */
public class A071151 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A071151() {
    super(new PartialSumSequence(new A000040().skip()));
  }
}
