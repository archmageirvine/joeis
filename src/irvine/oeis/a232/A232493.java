package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232493 If n mod 2 = 0 then 2^n*3^(n-1)+2^(n+1)*3^(n/2-1) otherwise 2^n*3^(n-1)+2^n*3^((n-1)/2).
 * @author Sean A. Irvine
 */
public class A232493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232493() {
    super(new long[] {-72, 12, 6}, new long[] {1, 4, 20});
  }
}
