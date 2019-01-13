package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272134.
 * @author Sean A. Irvine
 */
public class A272134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272134() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 68, 282});
  }
}
