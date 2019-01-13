package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103768.
 * @author Sean A. Irvine
 */
public class A103768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103768() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {0, 0, 6, 46, 228, 930});
  }
}
