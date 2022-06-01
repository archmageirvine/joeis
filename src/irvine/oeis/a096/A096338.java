package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096338 a(n) = (2/(n-1))*a(n-1) + ((n+5)/(n-1))*a(n-2) with a(0)=0 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A096338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096338() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 2, 6, 10, 20, 30, 50});
  }
}
