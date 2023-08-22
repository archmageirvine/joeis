package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;

/**
 * A065218 Consider the subsets of proper divisors of a number that sum to the number. These are numbers that set a record number of such subsets.
 * @author Sean A. Irvine
 */
public class A065218 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065218() {
    super(1, new A065205(), 1);
  }
}
