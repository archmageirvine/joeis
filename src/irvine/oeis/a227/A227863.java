package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227863.
 * @author Sean A. Irvine
 */
public class A227863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227863() {
    super(new long[] {-1, 1, 1}, new long[] {1, 49, 121});
  }
}
