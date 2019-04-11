package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022113 Fibonacci sequence beginning <code>2, 7</code>.
 * @author Sean A. Irvine
 */
public class A022113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022113() {
    super(new long[] {1, 1}, new long[] {2, 7});
  }
}
