package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099279 Squares of <code>A001076</code> (generalized Fibonacci).
 * @author Sean A. Irvine
 */
public class A099279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099279() {
    super(new long[] {-1, 17, 17}, new long[] {0, 1, 16});
  }
}
