package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015223 Odd pentagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A015223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015223() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 75, 405, 1183});
  }
}
