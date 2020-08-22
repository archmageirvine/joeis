package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215919 a(n) = -3*a(n-1) + a(n-3), with a(0)=0, a(1)=-3, a(2)=12.
 * @author Sean A. Irvine
 */
public class A215919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215919() {
    super(new long[] {1, 0, -3}, new long[] {0, -3, 12});
  }
}
