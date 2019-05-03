package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022100 Fibonacci sequence beginning <code>1, 10</code>.
 * @author Sean A. Irvine
 */
public class A022100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022100() {
    super(new long[] {1, 1}, new long[] {1, 10});
  }
}
