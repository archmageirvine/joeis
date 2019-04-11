package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206422 Fibonacci sequence beginning <code>11, 9</code>.
 * @author Sean A. Irvine
 */
public class A206422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206422() {
    super(new long[] {1, 1}, new long[] {11, 9});
  }
}
