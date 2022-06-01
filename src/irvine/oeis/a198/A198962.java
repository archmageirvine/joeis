package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198962 5*9^n-1.
 * @author Sean A. Irvine
 */
public class A198962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198962() {
    super(new long[] {-9, 10}, new long[] {4, 44});
  }
}
