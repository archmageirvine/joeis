package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155616 5^n + 4^n - 1.
 * @author Sean A. Irvine
 */
public class A155616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155616() {
    super(new long[] {20, -29, 10}, new long[] {1, 8, 40});
  }
}
