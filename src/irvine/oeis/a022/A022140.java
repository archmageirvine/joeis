package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022140 Fibonacci sequence beginning <code>5, 16</code>.
 * @author Sean A. Irvine
 */
public class A022140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022140() {
    super(new long[] {1, 1}, new long[] {5, 16});
  }
}
