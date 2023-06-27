package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268044 The odd numbers congruent to {3, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A268044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268044() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 9, 13});
  }
}
