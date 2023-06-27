package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257712 Triangular numbers (A000217) that are the sum of eight consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A257712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257712() {
    super(1, new long[] {1, -1, 0, 0, -1154, 1154, 0, 0, 1}, new long[] {120, 276, 1176, 28920, 126756, 306936, 1345620, 33362196, 146264856});
  }
}
