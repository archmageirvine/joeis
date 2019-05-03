package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289977 p-INVERT of <code>(0,0,0,1,2,3,5,8,...)</code>, the Fibonacci numbers preceded by three zeros, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289977() {
    super(new long[] {1, 0, -1, -1, 0, -2, 1, 2}, new long[] {0, 0, 0, 1, 1, 2, 3, 7});
  }
}
