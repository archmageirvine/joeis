package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095153.
 * @author Sean A. Irvine
 */
public class A095153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095153() {
    super(new long[] {-315, 486, -196, 26}, new long[] {35, 1225, 24990, 426650});
  }
}
