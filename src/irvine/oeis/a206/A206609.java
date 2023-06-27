package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206609 Fibonacci sequence beginning 13, 9.
 * @author Sean A. Irvine
 */
public class A206609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206609() {
    super(1, new long[] {1, 1}, new long[] {13, 9});
  }
}
