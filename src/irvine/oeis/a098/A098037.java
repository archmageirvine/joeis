package irvine.oeis.a098;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001043;
import irvine.oeis.a001.A001222;


/**
 * A098037 Number of prime divisors, counted with multiplicity, of the sum of two consecutive primes.
 * Formula: <code>a(n) = A001222(A001043(n)).</code>
 * @author Georg Fischer
 */
public class A098037 extends NestedSequence {

  /** Construct the sequence. */
  public A098037() {
    super(1, new A001222(), new A001043(), 1, 1); 
  }

}
