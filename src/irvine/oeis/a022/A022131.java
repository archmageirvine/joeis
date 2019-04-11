package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022131 Fibonacci sequence beginning <code>4, 11</code>.
 * @author Sean A. Irvine
 */
public class A022131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022131() {
    super(new long[] {1, 1}, new long[] {4, 11});
  }
}
