package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022103 Fibonacci sequence beginning <code>1, 13</code>.
 * @author Sean A. Irvine
 */
public class A022103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022103() {
    super(new long[] {1, 1}, new long[] {1, 13});
  }
}
