package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022118 Fibonacci sequence beginning <code>2, 17</code>.
 * @author Sean A. Irvine
 */
public class A022118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022118() {
    super(new long[] {1, 1}, new long[] {2, 17});
  }
}
