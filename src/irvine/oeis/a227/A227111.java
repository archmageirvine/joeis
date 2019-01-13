package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227111.
 * @author Sean A. Irvine
 */
public class A227111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227111() {
    super(new long[] {-1, 1000002}, new long[] {0, 1});
  }
}
