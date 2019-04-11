package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157797 <code>a(n) = 8984250*n - 1996170</code>.
 * @author Sean A. Irvine
 */
public class A157797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157797() {
    super(new long[] {-1, 2}, new long[] {6988080, 15972330});
  }
}
