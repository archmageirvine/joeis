package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022358 Fibonacci sequence beginning <code>0, 24</code>.
 * @author Sean A. Irvine
 */
public class A022358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022358() {
    super(new long[] {1, 1}, new long[] {0, 24});
  }
}
