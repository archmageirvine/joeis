package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074566 a(n) = 4^n + 6^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074566() {
    super(new long[] {192, -104, 18}, new long[] {3, 18, 116});
  }
}
