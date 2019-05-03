package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123268 X-values of solutions to the equation <code>3(X-Y)^4 - X*Y = 0</code> with X <code>&gt;=</code> Y.
 * @author Sean A. Irvine
 */
public class A123268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123268() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {0, 8, 1372, 263640});
  }
}
