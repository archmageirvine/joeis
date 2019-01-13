package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214630.
 * @author Sean A. Irvine
 */
public class A214630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214630() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {-1, 0, 0, 2, 3, 6, 2, 12, 15, 20, 6, 30});
  }
}
