package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049876 a(n)=Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; <code>a(n-3)</code> is not a summand; 3 initial terms required.
 * @author Sean A. Irvine
 */
public class A049876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049876() {
    super(new long[] {1, -1, 0, 2}, new long[] {2, 3, 4, 7});
  }
}
