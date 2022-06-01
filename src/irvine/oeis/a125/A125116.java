package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125116 Number of 8 X 8 pandiagonal Franklin squares with magic sum 4n.
 * @author Sean A. Irvine
 */
public class A125116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125116() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 32, 417, 3072, 15585, 60960, 197057, 550912, 1374273});
  }
}
