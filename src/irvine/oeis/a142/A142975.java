package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142975 n-th term of the Fibonacci-type sequence x(1)=1, x(2)=fibonacci(n), x(k+1)=x(k)+x(k-1) for k&gt;1.
 * @author Sean A. Irvine
 */
public class A142975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142975() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {1, 1, 3, 7, 17});
  }
}
