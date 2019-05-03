package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022372 Fibonacci sequence beginning <code>2, 20</code>.
 * @author Sean A. Irvine
 */
public class A022372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022372() {
    super(new long[] {1, 1}, new long[] {2, 20});
  }
}
