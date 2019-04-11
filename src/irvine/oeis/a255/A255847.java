package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255847 <code>a(n) = 2*n^2 + 16</code>.
 * @author Sean A. Irvine
 */
public class A255847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255847() {
    super(new long[] {1, -3, 3}, new long[] {16, 18, 24});
  }
}
