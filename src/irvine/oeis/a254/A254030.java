package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254030 a(n) = 1*4^n + 2*3^n + 3*2^n + 4*1^n.
 * @author Sean A. Irvine
 */
public class A254030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254030() {
    super(new long[] {-24, 50, -35, 10}, new long[] {10, 20, 50, 146});
  }
}
