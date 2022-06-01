package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206419 Fibonacci sequence beginning 11, 7.
 * @author Sean A. Irvine
 */
public class A206419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206419() {
    super(new long[] {1, 1}, new long[] {11, 7});
  }
}
