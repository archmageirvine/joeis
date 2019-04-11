package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010379 Squares <code>mod 17</code>.
 * @author Sean A. Irvine
 */
public class A010379 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010379() {
    super(0, 1, 2, 4, 8, 9, 13, 15, 16);
  }
}
