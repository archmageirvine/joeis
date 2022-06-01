package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075528 Triangular numbers that are half other triangular numbers.
 * @author Sean A. Irvine
 */
public class A075528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075528() {
    super(new long[] {1, -35, 35}, new long[] {0, 3, 105});
  }
}
