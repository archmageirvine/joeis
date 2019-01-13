package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224520.
 * @author Sean A. Irvine
 */
public class A224520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224520() {
    super(new long[] {-2, 3, -1, 0, -2, 3}, new long[] {0, 1, 3, 7, 15, 30});
  }
}
