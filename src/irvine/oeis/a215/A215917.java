package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215917 a(n) = -3*a(n-1) + a(n-3), with a(0)=0, a(1)=6, and a(2)=-15.
 * @author Sean A. Irvine
 */
public class A215917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215917() {
    super(new long[] {1, 0, -3}, new long[] {0, 6, -15});
  }
}
