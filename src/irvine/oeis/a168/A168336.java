package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168336 a(n) = 5 + 7*floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A168336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168336() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 12});
  }
}
