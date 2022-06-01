package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050231 a(n) is the number of n-tosses having a run of 3 or more heads for a fair coin (i.e., probability is a(n)/2^n).
 * @author Sean A. Irvine
 */
public class A050231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050231() {
    super(new long[] {-2, -1, -1, 3}, new long[] {0, 0, 1, 3});
  }
}
