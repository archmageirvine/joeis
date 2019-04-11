package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073373 Third convolution of A001045(n+1) (generalized <code>(1</code>,2)-Fibonacci), <code>n&gt;=0,</code> with itself.
 * @author Sean A. Irvine
 */
public class A073373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073373() {
    super(new long[] {-16, -32, 8, 40, -1, -20, 2, 4}, new long[] {1, 4, 18, 60, 195, 576, 1644, 4488});
  }
}
