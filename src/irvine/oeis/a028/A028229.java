package irvine.oeis.a028;

import irvine.oeis.FiniteSequence;

/**
 * A028229 Call m Egyptian if we can partition m <code>= x_1+x_2+...+x_k</code> into positive integers <code>x_i</code> such that <code>Sum_{i=1..k} 1/x_i = 1</code>; sequence gives all non-Egyptian numbers.
 * @author Georg Fischer
 */
public class A028229 extends FiniteSequence {

  /** Construct the sequence. */
  public A028229() {
    super(2, 3, 5, 6, 7, 8, 12, 13, 14, 15, 19, 21, 23);
  }
}
