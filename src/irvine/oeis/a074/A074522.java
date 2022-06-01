package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074522 a(n) = 1^n + 6^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074522() {
    super(new long[] {54, -69, 16}, new long[] {3, 16, 118});
  }
}
