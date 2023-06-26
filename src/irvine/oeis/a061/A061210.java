package irvine.oeis.a061;

import irvine.oeis.FiniteSequence;

/**
 * A061210 Numbers which are the fourth powers of their digit sum.
 * @author Georg Fischer
 */
public class A061210 extends FiniteSequence {

  /** Construct the sequence. */
  public A061210() {
    super(1, FINITE, 0, 1, 2401, 234256, 390625, 614656, 1679616);
  }
}
