package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137693 Numbers n such that 3n^2-n = 6k^2-2k for some integer k&gt;0.
 * @author Sean A. Irvine
 */
public class A137693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137693() {
    super(new long[] {1, -1155, 1155}, new long[] {7, 7887, 9101399});
  }
}
