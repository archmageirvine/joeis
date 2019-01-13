package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195031.
 * @author Sean A. Irvine
 */
public class A195031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195031() {
    super(new long[] {-1, 0, 2, 0}, new long[] {5, 12, 10, 24});
  }
}
