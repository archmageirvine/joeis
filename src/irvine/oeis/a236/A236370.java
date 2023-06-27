package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236370 Sum of the largest parts in the partitions of 3n into 3 parts.
 * @author Sean A. Irvine
 */
public class A236370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236370() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 9, 34, 81, 163, 282});
  }
}
