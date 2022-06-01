package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074573 a(n) = 5^n + 6^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074573() {
    super(new long[] {270, -129, 20}, new long[] {3, 20, 142});
  }
}
