package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138978 Number of 3 X n matrices containing a 1 in the top left entry, all entries are integer values and adjacent entries differ by at most 1.
 * @author Sean A. Irvine
 */
public class A138978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138978() {
    super(1, new long[] {10, -31, 16}, new long[] {9, 121, 1665});
  }
}
