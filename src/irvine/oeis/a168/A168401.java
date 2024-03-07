package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168401 a(n) = 4 + 9*floor(n/2).
 * @author Sean A. Irvine
 */
public class A168401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168401() {
    super(1, new long[] {-1, 1, 1}, new long[] {4, 13, 13});
  }
}
