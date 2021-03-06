package irvine.oeis.a324;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a002.A002487;


/**
 * A324293 a(n) = A002487(sigma(n)).
 * Formula: <code>a(n) = A002487(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A324293 extends NestedSequence {

  /** Construct the sequence. */
  public A324293() {
    super(1, new A002487(), new A000203(), 0, 1); 
  }

}
