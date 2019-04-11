package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157264 <code>a(n) = 10368*n^2 - 15840*n + 6049</code>.
 * @author Sean A. Irvine
 */
public class A157264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157264() {
    super(new long[] {1, -3, 3}, new long[] {577, 15841, 51841});
  }
}
