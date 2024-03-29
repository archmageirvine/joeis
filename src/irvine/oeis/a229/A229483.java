package irvine.oeis.a229;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a005.A005117;


/**
 * A229483 Squarefree numbers whose indices are lucky numbers.
 * Formula: <code>a(n) = A005117(A000959(n)).</code>
 * @author Georg Fischer
 */
public class A229483 extends NestedSequence {

  /** Construct the sequence. */
  public A229483() {
    super(1, new A005117(), new A000959(), 1, 1); 
  }

}
