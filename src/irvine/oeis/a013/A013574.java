package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013574 Minimal scope of an <code>(n,2)</code> difference triangle.
 * @author Sean A. Irvine
 */
public class A013574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013574() {
    super(new long[] {-1, 2, -2, 2}, new long[] {3, 7, 10, 12});
  }
}
