package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022102 Fibonacci sequence beginning <code>1, 12</code>.
 * @author Sean A. Irvine
 */
public class A022102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022102() {
    super(new long[] {1, 1}, new long[] {1, 12});
  }
}
