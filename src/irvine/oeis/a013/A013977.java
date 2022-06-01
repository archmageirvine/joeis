package irvine.oeis.a013;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A013977 Molien series of 4-dimensional representation of u.g.g.r. #9.
 * @author Sean A. Irvine
 */
public class A013977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013977() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 10, 40, 130, 283, 513, 883, 1372});
  }
}
