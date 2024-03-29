package irvine.oeis.a152;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a028.A028982;


/**
 * A152677 Subsequence of odd terms in A000203 (sum-of-divisors function sigma), in the order in which they occur and with repetitions.
 * Formula: <code>a(n) = A000203(A028982(n)).</code>
 * @author Georg Fischer
 */
public class A152677 extends NestedSequence {

  /** Construct the sequence. */
  public A152677() {
    super(1, new A000203(), new A028982(), 1, 1); 
  }

}
