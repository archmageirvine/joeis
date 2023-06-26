package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162935 Highly composite numbers (A002182) with property that the next highly composite number is more than 3/2 times greater.
 * @author Georg Fischer
 */
public class A162935 extends FiniteSequence {

  /** Construct the sequence. */
  public A162935() {
    super(1, FINITE, 1, 2, 6, 12, 60, 360, 2520, 27720);
  }
}
