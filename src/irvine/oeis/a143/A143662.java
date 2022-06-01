package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143662 a(n) is the number of n-tosses having a run of 6 or more heads for a fair coin (i.e., probability is a(n)/2^n).
 * @author Sean A. Irvine
 */
public class A143662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143662() {
    super(new long[] {-2, -1, -1, -1, -1, -1, 3}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
