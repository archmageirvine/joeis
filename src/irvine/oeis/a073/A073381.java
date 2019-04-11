package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073381 Fourth convolution of A000129(n+1) (generalized <code>(2</code>,1)-Fibonacci, called Pell numbers), <code>n&gt;=0,</code> with itself.
 * @author Sean A. Irvine
 */
public class A073381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073381() {
    super(new long[] {1, 10, 35, 40, -30, -68, 30, 40, -35, 10}, new long[] {1, 10, 65, 340, 1555, 6482, 25235, 93200, 330070, 1129580});
  }
}
