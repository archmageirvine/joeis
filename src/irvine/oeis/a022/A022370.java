package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022370 Fibonacci sequence beginning <code>2, 16</code>.
 * @author Sean A. Irvine
 */
public class A022370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022370() {
    super(new long[] {1, 1}, new long[] {2, 16});
  }
}
