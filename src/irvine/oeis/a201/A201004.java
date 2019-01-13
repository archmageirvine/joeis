package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201004.
 * @author Sean A. Irvine
 */
public class A201004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201004() {
    super(new long[] {1, -323, 323}, new long[] {0, 45, 14535});
  }
}
