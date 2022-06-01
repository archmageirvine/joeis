package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074537 a(n) = 2^n + 5^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074537() {
    super(new long[] {60, -52, 13}, new long[] {3, 13, 65});
  }
}
