package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048909 9-gonal (or nonagonal) triangular numbers.
 * @author Sean A. Irvine
 */
public class A048909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048909() {
    super(1, new long[] {1, -255, 255}, new long[] {1, 325, 82621});
  }
}
