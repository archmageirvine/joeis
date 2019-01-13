package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262492.
 * @author Sean A. Irvine
 */
public class A262492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262492() {
    super(new long[] {1, -1, 0, 0, -102, 102, 0, 0, 1}, new long[] {25, 90, 207, 1117, 2560, 9255, 21202, 114022, 261195});
  }
}
