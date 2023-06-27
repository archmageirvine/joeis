package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158770 a(n) = 1521*n^2 - 39.
 * @author Sean A. Irvine
 */
public class A158770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158770() {
    super(1, new long[] {1, -3, 3}, new long[] {1482, 6045, 13650});
  }
}
