package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158558 a(n) = 30n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158558() {
    super(new long[] {1, -3, 3}, new long[] {1, 31, 121});
  }
}
