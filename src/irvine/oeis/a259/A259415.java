package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259415 Triangular numbers (A000217) that are the sum of seventeen consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A259415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259415() {
    super(1, new long[] {1, -1, 0, 0, -4354, 4354, 0, 0, 1}, new long[] {1326, 9180, 24531, 1979055, 5325216, 39529386, 106368405, 8616365901L, 23185550130L});
  }
}
