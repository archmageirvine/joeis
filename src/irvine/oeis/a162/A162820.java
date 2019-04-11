package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162820 Positive numbers n such that <code>60*n/(60+n)</code> are integers.
 * @author Georg Fischer
 */
public class A162820 extends FiniteSequence {

  /** Construct the sequence. */
  public A162820() {
    super(12, 15, 20, 30, 40, 60, 84, 90, 120, 140, 165, 180, 240, 300, 340, 390, 540, 660, 840, 1140, 1740, 3540);
  }
}
