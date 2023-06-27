package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066067 Number of binary strings u of any length with property that length(u) + number of 0's in u &lt;= n (only one of a string and its reversal are counted).
 * @author Sean A. Irvine
 */
public class A066067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066067() {
    super(1, new long[] {-1, 1, 1, -2, 4, -4, -1, 3}, new long[] {1, 2, 3, 6, 10, 18, 29, 49});
  }
}
