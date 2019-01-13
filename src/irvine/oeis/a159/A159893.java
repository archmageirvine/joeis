package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159893.
 * @author Sean A. Irvine
 */
public class A159893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159893() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {677, 727, 785, 3277, 3635, 4033});
  }
}
