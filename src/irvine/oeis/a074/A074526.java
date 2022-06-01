package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074526 a(n) = 2^n + 3^n + 4^n.
 * @author Sean A. Irvine
 */
public class A074526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074526() {
    super(new long[] {24, -26, 9}, new long[] {3, 9, 29});
  }
}
