package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049870 a(n)=Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; a(n-3) is not a summand; 3 initial terms required.
 * @author Sean A. Irvine
 */
public class A049870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049870() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 2, 4, 6});
  }
}
