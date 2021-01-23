package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074617 a(n) = 5^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074617() {
    super(new long[] {-40, 13}, new long[] {2, 13});
  }
}
