package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074620 a(n) = 6^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074620() {
    super(new long[] {-48, 14}, new long[] {2, 14});
  }
}
