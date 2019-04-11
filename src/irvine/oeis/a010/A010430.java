package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010430 Squares <code>mod 69</code>.
 * @author Sean A. Irvine
 */
public class A010430 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010430() {
    super(0, 1, 3, 4, 6, 9, 12, 13, 16, 18, 24, 25, 27, 31, 36, 39, 46, 48, 49, 52, 54, 55, 58, 64);
  }
}
