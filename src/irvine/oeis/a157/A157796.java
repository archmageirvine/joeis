package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157796 <code>a(n) = 27225*n^2 - 12098*n + 1344</code>.
 * @author Sean A. Irvine
 */
public class A157796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157796() {
    super(new long[] {1, -3, 3}, new long[] {16471, 86048, 210075});
  }
}
