package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050233 a(n) is the number of n-tosses having a run of 5 or more heads for a fair coin (i.e., probability is a(n)/2^n).
 * @author Sean A. Irvine
 */
public class A050233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050233() {
    super(new long[] {-2, -1, -1, -1, -1, 3}, new long[] {0, 0, 0, 0, 1, 3});
  }
}
