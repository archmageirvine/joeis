package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049601 a(n)=Sum{T(2i,n-2i): <code>i=0,1,...,[ n/2 ]},</code> array T as in A049600.
 * @author Sean A. Irvine
 */
public class A049601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049601() {
    super(new long[] {1, -4, 3, 2}, new long[] {0, 0, 2, 3});
  }
}
