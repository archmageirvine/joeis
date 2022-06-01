package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008642 Quarter-squares repeated.
 * @author Sean A. Irvine
 */
public class A008642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008642() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 2, 2, 4, 4, 6});
  }
}

