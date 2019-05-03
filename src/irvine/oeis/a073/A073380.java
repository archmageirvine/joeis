package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073380 Third convolution of <code>A000129(n+1) (generalized (2,1)-Fibonacci</code>, called Pell numbers), <code>n&gt;=0</code>, with itself.
 * @author Sean A. Irvine
 */
public class A073380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073380() {
    super(new long[] {-1, -8, -20, -8, 26, 8, -20, 8}, new long[] {1, 8, 44, 200, 810, 3032, 10716, 36248});
  }
}
