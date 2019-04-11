package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022137 Fibonacci sequence beginning <code>5, 12</code>.
 * @author Sean A. Irvine
 */
public class A022137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022137() {
    super(new long[] {1, 1}, new long[] {5, 12});
  }
}
