package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243577 Integers of the form 8k+7 that can be written as a sum of four distinct 'almost consecutive' squares.
 * @author Sean A. Irvine
 */
public class A243577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243577() {
    super(new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {39, 71, 87, 119, 191, 255, 287});
  }
}
