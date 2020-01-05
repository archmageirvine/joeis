package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215039 <code>a(n) = Fibonacci(2*n)^3, n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A215039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215039() {
    super(new long[] {-1, 21, -56, 21}, new long[] {0, 1, 27, 512});
  }
}
