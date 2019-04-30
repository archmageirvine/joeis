package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049856 <code>a(n) =</code> Sum{a(k): <code>k=0,1,2,...,n-4,n-2,n-1}; a(n-3)</code> is not a summand; 3 initial terms required.
 * @author Sean A. Irvine
 */
public class A049856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049856() {
    super(new long[] {1, -1, 0, 2}, new long[] {0, 0, 1, 1});
  }
}
