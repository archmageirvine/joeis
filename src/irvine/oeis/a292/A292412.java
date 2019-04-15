package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292412 Numbers of the form <code>Fibonacci(2*k-1)</code> or <code>Lucas(2*k-1)</code>; i.e., union of sequences A001519 and A002878.
 * @author Sean A. Irvine
 */
public class A292412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292412() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 1, 2, 4});
  }
}
