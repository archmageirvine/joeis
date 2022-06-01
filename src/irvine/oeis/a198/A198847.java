package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198847 a(n) = 10*6^n - 1.
 * @author Sean A. Irvine
 */
public class A198847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198847() {
    super(new long[] {-6, 7}, new long[] {9, 59});
  }
}
