package irvine.oeis.a177;

import irvine.oeis.FiniteSequence;

/**
 * A177081 Numbers of the form <code>x^x</code>, where x equals the number of digits in the number.
 * @author Georg Fischer
 */
public class A177081 extends FiniteSequence {

  /** Construct the sequence. */
  public A177081() {
    super(1, 16777216, 387420489L);
  }
}
