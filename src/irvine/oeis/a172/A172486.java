package irvine.oeis.a172;

import irvine.oeis.FiniteSequence;

/**
 * A172486 Number of prime knots up to nine crossings with determinant 2n+1 and signature 6.
 * @author Georg Fischer
 */
public class A172486 extends FiniteSequence {

  /** Construct the sequence. */
  public A172486() {
    super(0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1);
  }
}
