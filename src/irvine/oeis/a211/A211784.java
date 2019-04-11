package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211784 <code>n^2 + floor(n^2/2) + floor(n^2/3)</code>.
 * @author Sean A. Irvine
 */
public class A211784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211784() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 7, 16, 29, 45, 66});
  }
}
