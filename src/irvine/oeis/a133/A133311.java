package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133311 The nonnegative integers reordered in groups of 5 even numbers followed by 5 odd numbers.
 * @author Sean A. Irvine
 */
public class A133311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133311() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 4, 6, 8, 1, 3, 5, 7, 9, 10});
  }
}
