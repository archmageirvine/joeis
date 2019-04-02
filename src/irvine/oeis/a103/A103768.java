package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103768 (29*3^n - 18(n + 3)*2^n + 6n^2 + 24n + 27)/12.
 * @author Sean A. Irvine
 */
public class A103768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103768() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {0, 0, 6, 46, 228, 930});
  }
}
