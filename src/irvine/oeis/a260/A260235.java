package irvine.oeis.a260;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000384;
import irvine.oeis.a001.A001221;


/**
 * A260235 Number of distinct prime factors of the n-th hexagonal number (A000384).
 * Formula: <code>a(n) = A001221(A000384(n)).</code>
 * @author Georg Fischer
 */
public class A260235 extends NestedSequence {

  /** Construct the sequence. */
  public A260235() {
    super(2, new A001221(), new A000384(), 1, 0); 
  }

}
