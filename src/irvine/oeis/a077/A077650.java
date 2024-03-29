package irvine.oeis.a077;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000030;
import irvine.oeis.a000.A000203;


/**
 * A077650 Initial decimal digit of sigma(n), the sum of divisors of n.
 * Formula: <code>a(n) = A000030(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A077650 extends NestedSequence {

  /** Construct the sequence. */
  public A077650() {
    super(1, new A000030(), new A000203(), 0, 1); 
  }

}
