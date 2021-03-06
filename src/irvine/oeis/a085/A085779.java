package irvine.oeis.a085;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a002.A002034;


/**
 * A085779 Smallest m such that the triangular number A000217(n) divides m!.
 * Formula: <code>a(n) = A002034(A000217(n)).</code>
 * @author Georg Fischer
 */
public class A085779 extends NestedSequence {

  /** Construct the sequence. */
  public A085779() {
    super(1, new A002034(), new A000217(), 1, 0); 
  }

}
