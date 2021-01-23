package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215112 a(n) = -2*a(n-1) + a(n-2) + a(n-3) with a(0)=a(1)=-1, a(2)=1.
 * @author Sean A. Irvine
 */
public class A215112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215112() {
    super(new long[] {1, 1, -2}, new long[] {-1, -1, 1});
  }
}
