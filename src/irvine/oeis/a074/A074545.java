package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074545 a(n) = 2^n + 7^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074545() {
    super(new long[] {126, -95, 18}, new long[] {3, 18, 134});
  }
}
