package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165758 a(n) = (12-7*6^n)/5.
 * @author Sean A. Irvine
 */
public class A165758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165758() {
    super(new long[] {-6, 7}, new long[] {1, -6});
  }
}
