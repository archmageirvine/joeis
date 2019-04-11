package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022374 Fibonacci sequence beginning <code>2, 24</code>.
 * @author Sean A. Irvine
 */
public class A022374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022374() {
    super(new long[] {1, 1}, new long[] {2, 24});
  }
}
