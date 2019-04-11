package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236257 <code>a(n) = 2*n^2 - 7*n + 9</code>.
 * @author Sean A. Irvine
 */
public class A236257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236257() {
    super(new long[] {1, -3, 3}, new long[] {9, 4, 3});
  }
}
