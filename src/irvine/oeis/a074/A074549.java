package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074549 a(n) = 3^n + 4^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074549() {
    super(new long[] {84, -61, 14}, new long[] {3, 14, 74});
  }
}
