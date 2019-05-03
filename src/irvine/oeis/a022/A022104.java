package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022104 Fibonacci sequence beginning <code>1, 14</code>.
 * @author Sean A. Irvine
 */
public class A022104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022104() {
    super(new long[] {1, 1}, new long[] {1, 14});
  }
}
