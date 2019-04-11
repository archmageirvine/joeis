package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010387 Squares <code>mod 25</code>.
 * @author Sean A. Irvine
 */
public class A010387 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010387() {
    super(0, 1, 4, 6, 9, 11, 14, 16, 19, 21, 24);
  }
}
