package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160765.
 * @author Sean A. Irvine
 */
public class A160765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160765() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 18, 112, 403, 1071});
  }
}
