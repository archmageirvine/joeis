package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105578.
 * @author Sean A. Irvine
 */
public class A105578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105578() {
    super(new long[] {2, -3, 2}, new long[] {1, 1, 0});
  }
}
