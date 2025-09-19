package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157769 a(n) = 8984250*n - 6468330.
 * @author Sean A. Irvine
 */
public class A157769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157769() {
    super(1, new long[] {-1, 2}, new long[] {2515920, 11500170});
  }
}
