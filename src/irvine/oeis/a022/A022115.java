package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022115 Fibonacci sequence beginning <code>2, 11</code>.
 * @author Sean A. Irvine
 */
public class A022115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022115() {
    super(new long[] {1, 1}, new long[] {2, 11});
  }
}
