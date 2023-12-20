package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137410 a(n) = (5^n - 3)/2.
 * @author Sean A. Irvine
 */
public class A137410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137410() {
    super(new long[] {-5, 6}, new long[] {-1, 1});
  }
}
