package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022126 Fibonacci sequence beginning <code>3, 16</code>.
 * @author Sean A. Irvine
 */
public class A022126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022126() {
    super(new long[] {1, 1}, new long[] {3, 16});
  }
}
