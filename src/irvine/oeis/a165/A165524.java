package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165524 Number of permutations of length n which avoid the patterns 4321 and 1324.
 * @author Sean A. Irvine
 */
public class A165524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165524() {
    super(1, new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 2, 6, 22, 86, 332, 1217, 4140, 12934, 37088, 98115, 241269});
  }
}
