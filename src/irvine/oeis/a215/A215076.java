package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215076 a(n) = 3*a(n-1) + 4*a(n-2) + a(n-3) with a(0)=3, a(1)=3, a(2)=17.
 * @author Sean A. Irvine
 */
public class A215076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215076() {
    super(new long[] {1, 4, 3}, new long[] {3, 3, 17});
  }
}
