package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027954 a(n) = T(2n+1, n+2), T given by A027948.
 * @author Sean A. Irvine
 */
public class A027954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027954() {
    super(new long[] {-1, 7, -19, 26, -19, 7}, new long[] {5, 41, 189, 674, 2098, 6050}, 1);
  }
}
