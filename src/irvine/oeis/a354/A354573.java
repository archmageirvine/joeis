package irvine.oeis.a354;
// Generated by gen_seq4.pl deris/primeval at 2022-10-26 15:17

import irvine.oeis.a038.A038361;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A354573 Prime partial sums of the primes == 5 (mod 6).
 * @author Georg Fischer
 */
public class A354573 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A354573() {
    super(new A038361());
  }
}
