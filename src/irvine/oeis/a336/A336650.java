package irvine.oeis.a336;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000265;
import irvine.oeis.a028.A028233;


/**
 * A336650 a(n) = p^e, where p is the smallest odd prime factor of n, and e is its exponent, with a(n) = 1 when n is a power of two.
 * Formula: <code>a(n) = A028233(A000265(n)).</code>
 * @author Georg Fischer
 */
public class A336650 extends NestedSequence {

  /** Construct the sequence. */
  public A336650() {
    super(1, new A028233(), new A000265(), 1, 1); 
  }

}
