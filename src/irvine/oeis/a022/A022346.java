package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022346 Fibonacci sequence beginning <code>0, 12</code>.
 * @author Sean A. Irvine
 */
public class A022346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022346() {
    super(new long[] {1, 1}, new long[] {0, 12});
  }
}
