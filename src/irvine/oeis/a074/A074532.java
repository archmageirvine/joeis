package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074532 a(n) = 2^n + 4^n + 5^n.
 * @author Sean A. Irvine
 */
public class A074532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074532() {
    super(new long[] {40, -38, 11}, new long[] {3, 11, 45});
  }
}
