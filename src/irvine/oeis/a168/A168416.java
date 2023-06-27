package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168416 a(n) = 1 + 9*floor(n/2).
 * @author Sean A. Irvine
 */
public class A168416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168416() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 10, 10});
  }
}
