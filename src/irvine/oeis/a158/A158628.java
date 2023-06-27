package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158628 a(n) = 44*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158628() {
    super(1, new long[] {1, -3, 3}, new long[] {43, 175, 395});
  }
}
