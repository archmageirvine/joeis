package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162690 Strictly positive numbers n such that <code>20*n/(20+n)</code> are integers.
 * @author Georg Fischer
 */
public class A162690 extends FiniteSequence {

  /** Construct the sequence. */
  public A162690() {
    super(5, 20, 30, 60, 80, 180, 380);
  }
}
