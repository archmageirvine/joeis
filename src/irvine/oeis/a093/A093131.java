package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093131 Binomial transform of <code>Fibonacci(2n)</code>.
 * @author Sean A. Irvine
 */
public class A093131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093131() {
    super(new long[] {-5, 5}, new long[] {0, 1});
  }
}
