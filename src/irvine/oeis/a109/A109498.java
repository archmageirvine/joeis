package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109498 Number of closed walks of length 2n on the Heawood graph from a given node.
 * @author Sean A. Irvine
 */
public class A109498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109498() {
    super(new long[] {-18, 11}, new long[] {1, 3});
  }
}
