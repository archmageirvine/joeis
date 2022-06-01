package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230586 a(n) = n^5 - 5*n^3 + 5*n.
 * @author Sean A. Irvine
 */
public class A230586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230586() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 123, 724, 2525, 6726});
  }
}
