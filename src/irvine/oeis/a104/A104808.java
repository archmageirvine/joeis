package irvine.oeis.a104;

import irvine.oeis.PositionSequence;

/**
 * A104808 Positions of 10 in A104807.
 * @author Georg Fischer
 */
public class A104808 extends PositionSequence {

  /** Construct the sequence. */
  public A104808() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param number
   */
  public A104808(final int number) {
    super(1, new A104807(), number);
  }
}
