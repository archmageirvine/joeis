package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247112 Floor of sums of the cubes of the non-integer square roots of <code>n,</code> as partitioned by the integer roots: <code>floor(</code> sum( j from <code>n^2+1</code> to <code>(n+1)^2-1,</code> j^(3/2) <code>) )</code>.
 * @author Sean A. Irvine
 */
public class A247112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247112() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 67, 267, 746});
  }
}
