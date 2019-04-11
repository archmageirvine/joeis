package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010403 Squares <code>mod 42</code>.
 * @author Sean A. Irvine
 */
public class A010403 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010403() {
    super(0, 1, 4, 7, 9, 15, 16, 18, 21, 22, 25, 28, 30, 36, 37, 39);
  }
}
