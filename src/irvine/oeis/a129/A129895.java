package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129895 <code>a(1)=1</code>. <code>a(n) = a(n-1) +</code> number of triangular numbers among the first <code>(n-1)</code> terms of the sequence.
 * @author Sean A. Irvine
 */
public class A129895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129895() {
    super(new long[] {1, -2, 0, 2, 0, -2, 0, 2}, new long[] {1, 2, 3, 5, 7, 9, 11, 13});
  }
}
