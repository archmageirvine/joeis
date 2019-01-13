package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152767.
 * @author Sean A. Irvine
 */
public class A152767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152767() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 30});
  }
}
