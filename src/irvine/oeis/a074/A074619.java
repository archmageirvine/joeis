package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074619 a(n) = 6^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074619() {
    super(new long[] {-42, 13}, new long[] {2, 13});
  }
}
