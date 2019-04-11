package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093967 <code>a(n) = n *</code> Pell(n).
 * @author Sean A. Irvine
 */
public class A093967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093967() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 1, 4, 15});
  }
}
