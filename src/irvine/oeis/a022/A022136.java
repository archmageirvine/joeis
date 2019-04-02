package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022136 Fibonacci sequence beginning 5, 11.
 * @author Sean A. Irvine
 */
public class A022136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022136() {
    super(new long[] {1, 1}, new long[] {5, 11});
  }
}
