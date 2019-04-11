package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162688 Strictly positive numbers n such that <code>12*n/(12+n)</code> are integers.
 * @author Georg Fischer
 */
public class A162688 extends FiniteSequence {

  /** Construct the sequence. */
  public A162688() {
    super(4, 6, 12, 24, 36, 60, 132);
  }
}
