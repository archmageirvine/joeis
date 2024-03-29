package irvine.oeis.a336;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a007.A007814;


/**
 * A336937 The 2-adic valuation of sigma(n), the sum of divisors of n.
 * Formula: <code>a(n) = A007814(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A336937 extends NestedSequence {

  /** Construct the sequence. */
  public A336937() {
    super(1, new A007814(), new A000203(), 1, 1); 
  }

}
