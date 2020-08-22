package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049686 a(n) = Fibonacci(8n)/3.
 * @author Sean A. Irvine
 */
public class A049686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049686() {
    super(new long[] {-1, 47}, new long[] {0, 7});
  }
}
