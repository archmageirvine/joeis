package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167826 a(n) is the number of n-tosses having a run of 3 or more heads and a run of 3 or more tails for a fair coin.
 * @author Sean A. Irvine
 */
public class A167826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167826() {
    super(1, new long[] {2, 3, 0, -3, -3, 4}, new long[] {0, 0, 0, 0, 0, 2});
  }
}
