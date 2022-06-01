package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099366 Squares of A005668(n) (generalized Fibonacci).
 * @author Sean A. Irvine
 */
public class A099366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099366() {
    super(new long[] {-1, 37, 37}, new long[] {0, 1, 36});
  }
}
