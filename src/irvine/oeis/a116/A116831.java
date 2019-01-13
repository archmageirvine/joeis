package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116831.
 * @author Sean A. Irvine
 */
public class A116831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116831() {
    super(new long[] {2, -15, 53, -115, 166, -162, 105, -43, 10}, new long[] {1, 2, 6, 21, 74, 247, 769, 2247, 6238});
  }
}
