package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010376 Squares <code>mod 13</code>.
 * @author Sean A. Irvine
 */
public class A010376 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010376() {
    super(0, 1, 3, 4, 9, 10, 12);
  }
}
