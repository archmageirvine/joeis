package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215945 a(n) = - 3^n*A(2*n+1), where A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3, with A(0)=A(1)=3, A(2)=11.
 * @author Sean A. Irvine
 */
public class A215945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215945() {
    super(new long[] {3, -27, 33}, new long[] {-3, -105, -3387});
  }
}
