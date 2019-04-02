package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155977 a(n) = n^5 + n^3.
 * @author Sean A. Irvine
 */
public class A155977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155977() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 2, 40, 270, 1088, 3250});
  }
}
