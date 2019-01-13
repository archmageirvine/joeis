package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249578.
 * @author Sean A. Irvine
 */
public class A249578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249578() {
    super(new long[] {-1, 0, 0, 4, 0, 0}, new long[] {0, 1, 0, 1, 2, 3});
  }
}
