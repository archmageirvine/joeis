package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227104.
 * @author Sean A. Irvine
 */
public class A227104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227104() {
    super(new long[] {1, 2, 1, 0}, new long[] {-1, 3, 2, 3});
  }
}
