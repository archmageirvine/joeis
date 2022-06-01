package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230018 a(n) = (9*n^3 + 5*n)/2.
 * @author Sean A. Irvine
 */
public class A230018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230018() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 41, 129, 298});
  }
}
