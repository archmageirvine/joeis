package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093374.
 * @author Sean A. Irvine
 */
public class A093374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093374() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 5, 18, 57});
  }
}
