package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027982 a(n) = Sum_{k=0..2*n} (k+1)*T(n, 2*n-k), T given by A027960.
 * @author Sean A. Irvine
 */
public class A027982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027982() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 10, 38, 108});
  }
}
