package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215945 <code>a(n) = - 3^n*A(2*n+1)</code>, where <code>A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3</code>, with <code>A(0)=A(1)=3, A(2)=11</code>.
 * @author Sean A. Irvine
 */
public class A215945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215945() {
    super(new long[] {3, -27, 33}, new long[] {-3, -105, -3387});
  }
}
