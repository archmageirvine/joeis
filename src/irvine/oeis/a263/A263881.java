package irvine.oeis.a263;

import irvine.oeis.FiniteSequence;

/**
 * A263881 Numbers k such that <code>k!</code> is a "compact factorial", i.e., <code>k!</code> is in <code>A169661</code>.
 * @author Georg Fischer
 */
public class A263881 extends FiniteSequence {

  /** Construct the sequence. */
  public A263881() {
    super(1, 2, 3, 6, 7, 10, 11);
  }
}
