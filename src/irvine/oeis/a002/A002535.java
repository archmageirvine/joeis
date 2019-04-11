package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002535 <code>a(n) = 2*a(n-1) + 9*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A002535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002535() {
    super(new long[] {9, 2}, new long[] {1, 1});
  }
}
