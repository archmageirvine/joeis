package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158743 a(n) = 1369*n^2 - 37.
 * @author Sean A. Irvine
 */
public class A158743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158743() {
    super(new long[] {1, -3, 3}, new long[] {1332, 5439, 12284});
  }
}
