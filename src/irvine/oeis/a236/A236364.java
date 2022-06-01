package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236364 Sum of all the middle parts in the partitions of 3n into 3 parts.
 * @author Sean A. Irvine
 */
public class A236364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236364() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 5, 18, 40, 80, 135});
  }
}
