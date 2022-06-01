package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272352 a(n) is the number of ways of putting n labeled balls into 2 indistinguishable boxes such that each box contains at least 3 balls.
 * @author Sean A. Irvine
 */
public class A272352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272352() {
    super(new long[] {-2, 7, -9, 5}, new long[] {10, 35, 91, 210});
  }
}
