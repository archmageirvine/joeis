package irvine.oeis.a122;

import irvine.oeis.FiniteSequence;

/**
 * A122106 Numbers of the form (1+2n^2+3n^3)/(2n-1).
 * @author Georg Fischer
 */
public class A122106 extends FiniteSequence {

  /** Construct the sequence. */
  public A122106() {
    super(-1, 0, 3, 6, 11, 20, 62, 111);
  }
}
