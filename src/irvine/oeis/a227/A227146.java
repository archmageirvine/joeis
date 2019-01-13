package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227146.
 * @author Sean A. Irvine
 */
public class A227146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227146() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 11, 13, 14, 19, 29});
  }
}
