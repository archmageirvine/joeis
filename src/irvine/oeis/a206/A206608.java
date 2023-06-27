package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206608 Fibonacci sequence beginning 13, 10.
 * @author Sean A. Irvine
 */
public class A206608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206608() {
    super(1, new long[] {1, 1}, new long[] {13, 10});
  }
}
