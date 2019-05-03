package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099366 Squares of <code>A005668(n) (generalized Fibonacci)</code>.
 * @author Sean A. Irvine
 */
public class A099366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099366() {
    super(new long[] {-1, 37, 37}, new long[] {0, 1, 36});
  }
}
