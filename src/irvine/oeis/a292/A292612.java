package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292612 <code>a(n) = F(n)^2 + 4*(-1)^n = F(n+3)*F(n-3)</code>, where F <code>= A000045</code>.
 * @author Sean A. Irvine
 */
public class A292612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292612() {
    super(new long[] {-1, 2, 2}, new long[] {4, -3, 5});
  }
}
