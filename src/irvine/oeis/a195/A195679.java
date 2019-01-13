package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195679.
 * @author Sean A. Irvine
 */
public class A195679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195679() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {2, 2, 0, -1, 0, 0, 0, -1});
  }
}
