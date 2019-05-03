package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022367 Fibonacci sequence beginning <code>2, 10</code>.
 * @author Sean A. Irvine
 */
public class A022367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022367() {
    super(new long[] {1, 1}, new long[] {2, 10});
  }
}
