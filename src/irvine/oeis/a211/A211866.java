package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211866 (9^n - 5) / 4.
 * @author Sean A. Irvine
 */
public class A211866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211866() {
    super(1, new long[] {-9, 10}, new long[] {1, 19});
  }
}
