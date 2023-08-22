package irvine.oeis.a065;

import irvine.oeis.RecordSequence;

/**
 * A065219 Number of subsets of proper divisors of numbers in A065218 summing to the number.
 * @author Sean A. Irvine
 */
public class A065219 extends RecordSequence {

  /** Construct the sequence. */
  public A065219() {
    super(1, new A065205());
  }
}
