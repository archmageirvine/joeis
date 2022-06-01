package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292612 a(n) = F(n)^2 + 4*(-1)^n = F(n+3)*F(n-3), where F = A000045.
 * @author Sean A. Irvine
 */
public class A292612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292612() {
    super(new long[] {-1, 2, 2}, new long[] {4, -3, 5});
  }
}
