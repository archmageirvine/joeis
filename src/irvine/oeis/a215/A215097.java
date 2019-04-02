package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215097 a(n) = n^3 - a(n-2) for n &gt;= 2 and a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A215097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215097() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {0, 1, 8, 26, 56, 99});
  }
}
