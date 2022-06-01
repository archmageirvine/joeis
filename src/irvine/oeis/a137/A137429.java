package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137429 a(n) = -2*a(n-1) - 2*a(n-2), with a(0)=1 and a(1)=-4.
 * @author Sean A. Irvine
 */
public class A137429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137429() {
    super(new long[] {-2, -2}, new long[] {1, -4});
  }
}
