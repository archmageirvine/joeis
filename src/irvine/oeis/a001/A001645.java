package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001645 A Fielder sequence.
 * @author Sean A. Irvine
 */
public class A001645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001645() {
    super(new long[] {1, 0, 1, 1, 1}, new long[] {1, 3, 7, 11, 26});
  }
}
