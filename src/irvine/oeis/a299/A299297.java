package irvine.oeis.a299;

import irvine.oeis.FiniteSequence;

/**
 * A299297 Numbers <code>g&gt;1</code> such that the maximal order of an embedding of a finite graph of genus g into the sphere <code>S^3</code> is <code>12(g-1)</code>.
 * @author Georg Fischer
 */
public class A299297 extends FiniteSequence {

  /** Construct the sequence. */
  public A299297() {
    super(2, 3, 4, 5, 6, 9, 11, 17, 25, 97, 121, 241, 601);
  }
}
