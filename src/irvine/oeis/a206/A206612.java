package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206612 Fibonacci sequence beginning 13, 6.
 * @author Sean A. Irvine
 */
public class A206612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206612() {
    super(new long[] {1, 1}, new long[] {13, 6});
  }
}
