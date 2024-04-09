package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152032 a(n) = 3/8 + (3/8)*(-1)^n + ((n+1)/4)*(-1)^(n+1) + ((n+2)*(n+1)/4)*(-1)^(n+2).
 * @author Sean A. Irvine
 */
public class A152032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152032() {
    super(new long[] {1, 2, 0, -2}, new long[] {1, -1, 3, -4});
  }
}
