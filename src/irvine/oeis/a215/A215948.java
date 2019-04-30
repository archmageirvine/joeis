package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215948 <code>a(n) = 3^n*A(2*n)</code>, where <code>A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3</code> with <code>A(0)=A(1)=3, A(2)=11</code>.
 * @author Sean A. Irvine
 */
public class A215948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215948() {
    super(new long[] {3, -27, 33}, new long[] {3, 33, 1035});
  }
}
