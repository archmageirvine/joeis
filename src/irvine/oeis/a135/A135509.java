package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135509 Values c^(1/2) from a^(1/2) + b^(1/2) = c^(1/2) such that a^2 + b = c.
 * @author Sean A. Irvine
 */
public class A135509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135509() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 25, 225, 1156, 4225, 12321});
  }
}
