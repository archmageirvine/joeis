package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289977 p-INVERT of (0,0,0,1,2,3,5,8,...), the Fibonacci numbers preceded by three zeros, where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289977() {
    super(new long[] {1, 0, -1, -1, 0, -2, 1, 2}, new long[] {0, 0, 0, 1, 1, 2, 3, 7});
  }
}
