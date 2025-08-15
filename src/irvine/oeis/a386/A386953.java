package irvine.oeis.a386;

import irvine.oeis.PartialSumSequence;

/**
 * A194459 Number of entries in the n-th row of Pascal's triangle not divisible by 5.
 * @author Sean A. Irvine
 */
public class A386953 extends PartialSumSequence {

  /** Construct the sequence. */
  public A386953() {
    super(0, new A386952());
  }
}
