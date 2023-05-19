package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159254 Numbers whose square ends with 49.
 * @author Sean A. Irvine
 */
public class A159254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159254() {
    super(new long[] {-1, 1, 1}, new long[] {7, 43, 57});
  }
}
