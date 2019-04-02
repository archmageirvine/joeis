package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215635 a(n) = - 12*a(n-1) - 54*a(n-2) - 112*a(n-3) - 105*a(n-4) -36*a(n-5) - 2*a(n-6), with a(0)=3, a(1)=-6, a(2)=18, a(3)=-60, a(4)=210, a(5)=-756.
 * @author Sean A. Irvine
 */
public class A215635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215635() {
    super(new long[] {-2, -36, -105, -112, -54, -12}, new long[] {3, -6, 18, -60, 210, -756});
  }
}
