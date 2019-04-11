package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094584 Dot product of <code>(1,2,</code>...,n) and first n distinct Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A094584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094584() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {1, 5, 14, 34, 74});
  }
}
