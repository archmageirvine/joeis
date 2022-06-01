package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074512 a(n) = 1^n + 4^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074512() {
    super(new long[] {24, -34, 11}, new long[] {3, 11, 53});
  }
}
