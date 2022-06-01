package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198964 (7*9^n-1)/2.
 * @author Sean A. Irvine
 */
public class A198964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198964() {
    super(new long[] {-9, 10}, new long[] {3, 31});
  }
}
