package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074618 <code>a(n) = 5^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074618() {
    super(new long[] {-45, 14}, new long[] {2, 14});
  }
}
