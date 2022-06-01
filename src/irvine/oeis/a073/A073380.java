package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073380 Third convolution of A000129(n+1) (generalized (2,1)-Fibonacci, called Pell numbers), n&gt;=0, with itself.
 * @author Sean A. Irvine
 */
public class A073380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073380() {
    super(new long[] {-1, -8, -20, -8, 26, 8, -20, 8}, new long[] {1, 8, 44, 200, 810, 3032, 10716, 36248});
  }
}
