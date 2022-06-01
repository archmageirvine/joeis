package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001640 A Fielder sequence.
 * @author Sean A. Irvine
 */
public class A001640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001640() {
    super(new long[] {1, 1, 1, 1, 0, 1}, new long[] {1, 1, 4, 9, 16, 28});
  }
}
