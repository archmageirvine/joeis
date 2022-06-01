package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051895 Partial sums of second pentagonal numbers with even index (A049453).
 * @author Sean A. Irvine
 */
public class A051895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051895() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 33, 90});
  }
}
