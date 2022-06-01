package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074618 a(n) = 5^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074618() {
    super(new long[] {-45, 14}, new long[] {2, 14});
  }
}
