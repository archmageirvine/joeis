package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049864 a(n) = Sum_{k=0,1,2,...,n-4,n-2,n-1} a(k); a(n-3) is not a summand; 3 initial terms required.
 * @author Sean A. Irvine
 */
public class A049864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049864() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 1, 1, 2});
  }
}
