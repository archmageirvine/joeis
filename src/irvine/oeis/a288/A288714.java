package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288714 Number of (undirected) paths on the 2n-crossed prism graph.
 * @author Sean A. Irvine
 */
public class A288714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288714() {
    super(1, new long[] {128, -512, 840, -732, 366, -105, 16}, new long[] {26, 444, 3654, 22888, 124850, 628860, 3014438});
  }
}
