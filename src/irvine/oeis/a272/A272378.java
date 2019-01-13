package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272378.
 * @author Sean A. Irvine
 */
public class A272378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272378() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 22, 99});
  }
}
