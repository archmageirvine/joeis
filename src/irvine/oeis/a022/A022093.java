package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022093 Fibonacci sequence beginning <code>0, 10</code>.
 * @author Sean A. Irvine
 */
public class A022093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022093() {
    super(new long[] {1, 1}, new long[] {0, 10});
  }
}
