package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077951.
 * @author Sean A. Irvine
 */
public class A077951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077951() {
    super(new long[] {2, -1, 1}, new long[] {1, 1, 0});
  }
}
