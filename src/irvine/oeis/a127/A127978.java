package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127978 a(n) = ((15*n + 34)/54)*2^(n-1) - (-1)^(n-1)*(6*n + 5)/27.
 * @author Sean A. Irvine
 */
public class A127978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127978() {
    super(new long[] {-4, -4, 3, 2}, new long[] {3, 5, 15, 31});
  }
}
