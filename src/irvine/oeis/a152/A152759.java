package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152759 3 times <code>9-gonal</code> (or nonagonal) numbers: <code>3n(7n-5)/2</code>.
 * @author Sean A. Irvine
 */
public class A152759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152759() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 27});
  }
}
