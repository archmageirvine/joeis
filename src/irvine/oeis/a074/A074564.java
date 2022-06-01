package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074564 a(n) = 4^n + 5^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074564() {
    super(new long[] {180, -101, 18}, new long[] {3, 18, 122});
  }
}
