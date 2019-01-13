package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093953.
 * @author Sean A. Irvine
 */
public class A093953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093953() {
    super(new long[] {10, -17, 8}, new long[] {1, 10, 63});
  }
}
