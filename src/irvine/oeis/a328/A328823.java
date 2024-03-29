package irvine.oeis.a328;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000096;
import irvine.oeis.a020.A020639;


/**
 * A328823 a(n) is the least prime factor of A000096(n) = n*(n+3)/2.
 * Formula: <code>a(n) = A020639(A000096(n)).</code>
 * @author Georg Fischer
 */
public class A328823 extends NestedSequence {

  /** Construct the sequence. */
  public A328823() {
    super(1, new A020639(), new A000096(), 1, 0); 
  }

}
