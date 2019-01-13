package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109961.
 * @author Sean A. Irvine
 */
public class A109961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109961() {
    super(new long[] {-1, 4, -5, 4}, new long[] {1, 1, 2, 6});
  }
}
