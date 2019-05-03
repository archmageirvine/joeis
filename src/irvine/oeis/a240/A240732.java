package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240732 The unique set of ten distinct positive numbers up to 35 the sum of whose reciprocals of squares is 1/2.
 * @author Georg Fischer
 */
public class A240732 extends FiniteSequence {

  /** Construct the sequence. */
  public A240732() {
    super(2, 3, 4, 5, 7, 12, 15, 20, 28, 35);
  }
}
