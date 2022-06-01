package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027793 a(n) = 28*(n+1)*binomial(n+3,8)/3.
 * @author Sean A. Irvine
 */
public class A027793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027793() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {56, 588, 3360, 13860, 46200, 132132, 336336, 780780, 1681680, 3403400});
  }
}
