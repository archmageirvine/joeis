package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013978 Molien series of 4-dimensional representation of u.g.g.r. <code>#8</code>.
 * @author Sean A. Irvine
 */
public class A013978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013978() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {1, 0, 10, 20, 40, 75, 130, 179, 283, 383});
  }
}
