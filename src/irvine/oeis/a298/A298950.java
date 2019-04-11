package irvine.oeis.a298;

import irvine.oeis.LinearRecurrence;

/**
 * A298950 Numbers k such that 5*k <code>- 4</code> is a square.
 * @author Sean A. Irvine
 */
public class A298950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298950() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 8, 17, 25});
  }
}
