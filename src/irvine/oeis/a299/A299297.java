package irvine.oeis.a299;

import irvine.oeis.FiniteSequence;

/**
 * A299297 Numbers g&gt;1 such that the maximal order of an embedding of a finite graph of genus g into the sphere S^3 is 12(g-1).
 * @author Georg Fischer
 */
public class A299297 extends FiniteSequence {

  /** Construct the sequence. */
  public A299297() {
    super(1, FINITE, 2, 3, 4, 5, 6, 9, 11, 17, 25, 97, 121, 241, 601);
  }
}
