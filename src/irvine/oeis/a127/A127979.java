package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127979 a(n) = (5*n/18 + 19/54)*2^n - (-1)^(n-1)*(3*n + 4)/27.
 * @author Sean A. Irvine
 */
public class A127979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127979() {
    super(new long[] {-4, -4, 3, 2}, new long[] {1, 4, 9, 24});
  }
}
