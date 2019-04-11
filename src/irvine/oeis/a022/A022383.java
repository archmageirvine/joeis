package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022383 Fibonacci sequence beginning <code>4, 14</code>.
 * @author Sean A. Irvine
 */
public class A022383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022383() {
    super(new long[] {1, 1}, new long[] {4, 14});
  }
}
