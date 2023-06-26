package irvine.oeis.a261;

import irvine.oeis.FiniteSequence;

/**
 * A261040 Values of c such that the Diophantine equation 5*a + 3*b = c has no solutions in positive integers.
 * @author Georg Fischer
 */
public class A261040 extends FiniteSequence {

  /** Construct the sequence. */
  public A261040() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 9, 10, 12, 15);
  }
}
