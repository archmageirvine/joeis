package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022369 Fibonacci sequence beginning <code>2, 14</code>.
 * @author Sean A. Irvine
 */
public class A022369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022369() {
    super(new long[] {1, 1}, new long[] {2, 14});
  }
}
