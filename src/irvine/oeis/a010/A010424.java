package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010424 Squares <code>mod 63</code>.
 * @author Sean A. Irvine
 */
public class A010424 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010424() {
    super(0, 1, 4, 7, 9, 16, 18, 22, 25, 28, 36, 37, 43, 46, 49, 58);
  }
}
