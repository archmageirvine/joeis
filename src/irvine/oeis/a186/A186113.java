package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186113.
 * @author Sean A. Irvine
 */
public class A186113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186113() {
    super(new long[] {-1, 2}, new long[] {6, 19});
  }
}
