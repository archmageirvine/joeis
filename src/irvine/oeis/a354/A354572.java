package irvine.oeis.a354;
// Generated by gen_seq4.pl deris/primeval at 2022-10-26 15:17

import irvine.oeis.a038.A038349;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A354572 Prime partial sums of the primes == 1 (mod 6).
 * @author Georg Fischer
 */
public class A354572 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A354572() {
    super(new A038349());
  }
}
