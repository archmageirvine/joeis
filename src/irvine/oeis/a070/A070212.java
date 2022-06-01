package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070212 Number of 5 X 5 pandiagonal magic squares with sum n.
 * @author Sean A. Irvine
 */
public class A070212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070212() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 10, 55, 220, 715, 2001, 4995, 11385, 24090});
  }
}
