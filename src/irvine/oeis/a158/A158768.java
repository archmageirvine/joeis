package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158768 a(n) = 1521*n^2 + 39.
 * @author Sean A. Irvine
 */
public class A158768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158768() {
    super(new long[] {1, -3, 3}, new long[] {39, 1560, 6123});
  }
}
