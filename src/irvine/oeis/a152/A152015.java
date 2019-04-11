package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152015 <code>n^3-n^2-n</code>.
 * @author Sean A. Irvine
 */
public class A152015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152015() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -1, 2, 15});
  }
}
