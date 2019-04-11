package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121672 Real part of <code>(n +</code> i)^5.
 * @author Sean A. Irvine
 */
public class A121672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121672() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, -4, -38, -12, 404, 1900});
  }
}
