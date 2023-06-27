package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168411 a(n) = 7 + 9*floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A168411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168411() {
    super(1, new long[] {-1, 1, 1}, new long[] {7, 7, 16});
  }
}
