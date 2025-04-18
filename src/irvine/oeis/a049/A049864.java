package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049864 a(n) = Sum_{k=0,1,2,...,n-4,n-2,n-1} a(k); a(n-3) is not a summand, with a(0)=a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A049864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049864() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 1, 1, 2});
  }
}
