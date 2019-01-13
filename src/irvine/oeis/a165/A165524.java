package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165524.
 * @author Sean A. Irvine
 */
public class A165524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165524() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 2, 6, 22, 86, 332, 1217, 4140, 12934, 37088, 98115, 241269});
  }
}
