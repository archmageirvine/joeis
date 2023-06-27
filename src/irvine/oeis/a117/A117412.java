package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117412 Sum of the interior angles of an n-sided polygon, in gradians.
 * @author Sean A. Irvine
 */
public class A117412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117412() {
    super(3, new long[] {-1, 2}, new long[] {200, 400});
  }
}
