package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054761.
 * @author Sean A. Irvine
 */
public class A054761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054761() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 2, -3, -3, 4}, new long[] {1, 4, 13, 37, 99, 254, 636, 1567, 3822, 9261});
  }
}
