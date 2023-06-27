package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206423 Fibonacci sequence beginning 12, 7.
 * @author Sean A. Irvine
 */
public class A206423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206423() {
    super(1, new long[] {1, 1}, new long[] {12, 7});
  }
}
