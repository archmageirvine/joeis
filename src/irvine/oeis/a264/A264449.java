package irvine.oeis.a264;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A264449 a(n) = n*(n + 7)*(n + 14)*(n + 21)*(n + 28)/120.
 * @author Sean A. Irvine
 */
public class A264449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264449() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 638, 1656, 3162, 5280, 8151});
  }
}
