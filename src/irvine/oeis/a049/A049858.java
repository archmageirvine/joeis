package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049858 a(n) = Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; a(n-3) is not a summand; 3 initial terms required.
 * @author Sean A. Irvine
 */
public class A049858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049858() {
    super(new long[] {1, -1, 0, 2}, new long[] {0, 1, 2, 3});
  }
}
