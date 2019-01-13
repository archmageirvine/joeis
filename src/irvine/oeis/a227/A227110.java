package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227110.
 * @author Sean A. Irvine
 */
public class A227110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227110() {
    super(new long[] {-1, 1000002}, new long[] {1, 500001});
  }
}
