package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014696 Poincar&#233; series [or Poincare series] (or Molien series) for <code>mod 2</code> cohomology of universal W-group <code>W(3)</code>.
 * @author Sean A. Irvine
 */
public class A014696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014696() {
    super(new long[] {-1, 2, 3, -8, -2, 12, -2, -8, 3, 2}, new long[] {1, 3, 14, 30, 77, 138, 273, 438, 748, 1113});
  }
}
