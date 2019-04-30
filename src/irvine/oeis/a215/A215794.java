package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215794 <code>a(n) = -7^n*A(2*n+1)</code>, where <code>A(n) = A(n-1) + A(n-2) + A(n-3)/7</code>, with <code>A(0)=3, A(1)=1, A(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A215794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215794() {
    super(new long[] {7, -35, 21}, new long[] {-1, -31, -609});
  }
}
