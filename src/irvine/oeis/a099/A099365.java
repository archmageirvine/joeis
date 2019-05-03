package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099365 Squares of <code>A052918(n-1) (generalized Fibonacci)</code>.
 * @author Sean A. Irvine
 */
public class A099365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099365() {
    super(new long[] {-1, 26, 26}, new long[] {0, 1, 25});
  }
}
