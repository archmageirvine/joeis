package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022385 Fibonacci sequence beginning 4, 22.
 * @author Sean A. Irvine
 */
public class A022385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022385() {
    super(new long[] {1, 1}, new long[] {4, 22});
  }
}
