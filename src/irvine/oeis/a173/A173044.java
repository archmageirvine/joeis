package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173044 Product plus sum of five consecutive nonnegative numbers.
 * @author Sean A. Irvine
 */
public class A173044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173044() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {10, 135, 740, 2545, 6750, 15155});
  }
}
