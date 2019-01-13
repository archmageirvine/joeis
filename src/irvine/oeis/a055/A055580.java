package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055580.
 * @author Sean A. Irvine
 */
public class A055580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055580() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 7, 31, 111});
  }
}
