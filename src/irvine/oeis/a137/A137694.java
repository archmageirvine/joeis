package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137694 Numbers k such that <code>6k^2-2k = 3n^2-n</code> for some integer <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A137694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137694() {
    super(new long[] {1, -1155, 1155}, new long[] {5, 5577, 6435661});
  }
}
