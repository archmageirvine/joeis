package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051032 Summatory Rudin-Shapiro sequence for 2^(n-1).
 * @author Sean A. Irvine
 */
public class A051032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051032() {
    super(new long[] {-2, 2, 1}, new long[] {2, 3, 3});
  }
}
