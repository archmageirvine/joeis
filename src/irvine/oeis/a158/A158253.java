package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158253 289n - 1.
 * @author Sean A. Irvine
 */
public class A158253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158253() {
    super(1, new long[] {-1, 2}, new long[] {288, 577});
  }
}
