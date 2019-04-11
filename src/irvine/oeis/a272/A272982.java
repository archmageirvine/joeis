package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272982 <code>a(n)</code> is the number of ways of putting n labeled balls into 3 indistinguishable boxes such that each box contains at least 3 balls.
 * @author Sean A. Irvine
 */
public class A272982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272982() {
    super(new long[] {24, -164, 490, -839, 906, -639, 294, -85, 14}, new long[] {280, 2100, 10395, 42735, 158301, 549549, 1827826, 5903898, 18682014});
  }
}
