package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215948 <code>a(n) =</code> 3^n*A(2*n), where A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3 with A(0)=A(1)=3, A(2)=11.
 * @author Sean A. Irvine
 */
public class A215948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215948() {
    super(new long[] {3, -27, 33}, new long[] {3, 33, 1035});
  }
}
