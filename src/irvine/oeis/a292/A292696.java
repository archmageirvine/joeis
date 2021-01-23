package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292696 a(n) = L(n)^2 - 5*(-1)^n = L(n+1)*L(n-1), where L = A000032.
 * @author Sean A. Irvine
 */
public class A292696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292696() {
    super(new long[] {-1, 2, 2}, new long[] {-1, 6, 4});
  }
}
