package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227137.
 * @author Sean A. Irvine
 */
public class A227137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227137() {
    super(new long[] {-1, 1000002}, new long[] {1, 1000003});
  }
}
