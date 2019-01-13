package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055519.
 * @author Sean A. Irvine
 */
public class A055519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055519() {
    super(new long[] {1, 9, -33, -76, 33, 9}, new long[] {1, 2, 35, 312, 3779, 41590});
  }
}
