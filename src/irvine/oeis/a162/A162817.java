package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162817 Positive numbers n such that 40*n/(40+n) are integers.
 * @author Georg Fischer
 */
public class A162817 extends FiniteSequence {

  /** Construct the sequence. */
  public A162817() {
    super(10, 24, 40, 60, 120, 160, 280, 360, 760, 1560);
  }
}
