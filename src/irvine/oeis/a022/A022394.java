package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022394 Fibonacci sequence beginning <code>1, 24</code>.
 * @author Sean A. Irvine
 */
public class A022394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022394() {
    super(new long[] {1, 1}, new long[] {1, 24});
  }
}
