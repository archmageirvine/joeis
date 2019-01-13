package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272039.
 * @author Sean A. Irvine
 */
public class A272039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272039() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 49});
  }
}
