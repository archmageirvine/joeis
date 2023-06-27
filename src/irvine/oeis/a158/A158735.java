package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158735 a(n) = 1225*n^2 - 35.
 * @author Sean A. Irvine
 */
public class A158735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158735() {
    super(1, new long[] {1, -3, 3}, new long[] {1190, 4865, 10990});
  }
}
