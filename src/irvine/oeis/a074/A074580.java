package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074580 a(n) = 7^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074580() {
    super(new long[] {504, -191, 24}, new long[] {3, 24, 194});
  }
}
