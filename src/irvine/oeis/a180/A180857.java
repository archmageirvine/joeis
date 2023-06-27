package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180857 Wiener index of the Moebius ladder M(n).
 * @author Sean A. Irvine
 */
public class A180857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180857() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 6, 21, 44, 85, 138});
  }
}
