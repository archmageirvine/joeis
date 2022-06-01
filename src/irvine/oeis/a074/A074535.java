package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074535 a(n) = 2^n + 4^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074535() {
    super(new long[] {64, -56, 14}, new long[] {3, 14, 84});
  }
}
