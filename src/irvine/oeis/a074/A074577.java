package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074577 a(n) = 6^n + 7^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074577() {
    super(new long[] {336, -146, 21}, new long[] {3, 21, 149});
  }
}
