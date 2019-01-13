package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048578.
 * @author Sean A. Irvine
 */
public class A048578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048578() {
    super(new long[] {-2, 3}, new long[] {3, 5});
  }
}
