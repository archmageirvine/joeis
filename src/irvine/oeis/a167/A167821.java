package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167821 a(n) is the number of n-tosses having a run of 3 or more heads or a run of 3 or more tails for a fair coin (i.e., probability is a(n)/2^n).
 * @author Sean A. Irvine
 */
public class A167821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167821() {
    super(new long[] {-2, -1, 3}, new long[] {0, 0, 2});
  }
}
