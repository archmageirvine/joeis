package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048489 a(n) = 7 * 2^n - 6.
 * @author Sean A. Irvine
 */
public class A048489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048489() {
    super(new long[] {-2, 3}, new long[] {1, 8});
  }
}
