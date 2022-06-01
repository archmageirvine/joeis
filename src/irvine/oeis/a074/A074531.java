package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074531 a(n) = 2^n + 3^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074531() {
    super(new long[] {54, -51, 14}, new long[] {3, 14, 94});
  }
}
