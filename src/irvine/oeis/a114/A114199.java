package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114199 Row sums of a Pascal-Fibonacci triangle.
 * @author Sean A. Irvine
 */
public class A114199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114199() {
    super(new long[] {1, 2, -5, 4}, new long[] {1, 2, 4, 8});
  }
}
