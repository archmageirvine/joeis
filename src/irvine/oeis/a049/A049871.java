package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049871 a(n)=Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; a(n-3) is not a summand; 3 initial terms required.
 * @author Sean A. Irvine
 */
public class A049871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049871() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 3, 3, 6});
  }
}
