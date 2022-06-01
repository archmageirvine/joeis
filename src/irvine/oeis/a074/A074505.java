package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074505 a(n) = 1^n + 2^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074505() {
    super(new long[] {18, -29, 12}, new long[] {3, 12, 86});
  }
}
