package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051375.
 * @author Sean A. Irvine
 */
public class A051375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051375() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 0, 9, 66});
  }
}
