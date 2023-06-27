package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054894 a(n+1) = 4*a(n) + 4*a(n-1) - 4*a(n-2) - a(n-3) with a(1)=1, a(2)=2, a(3)=11, a(4)=48.
 * @author Sean A. Irvine
 */
public class A054894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054894() {
    super(1, new long[] {-1, -4, 4, 4}, new long[] {1, 2, 11, 48});
  }
}
