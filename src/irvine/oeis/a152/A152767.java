package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152767 3 times 10-gonal (or decagonal) numbers: <code>3n(4n-3)</code>.
 * @author Sean A. Irvine
 */
public class A152767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152767() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 30});
  }
}
