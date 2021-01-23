package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207076 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x+487)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A207076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207076() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 185, 836, 1461, 2436, 6125, 9740});
  }
}
