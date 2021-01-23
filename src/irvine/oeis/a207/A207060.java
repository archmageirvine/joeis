package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207060 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x+401)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A207060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207060() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 259, 496, 1203, 2596, 3939, 8020});
  }
}
