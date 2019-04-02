package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022109 Fibonacci sequence beginning 1, 19.
 * @author Sean A. Irvine
 */
public class A022109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022109() {
    super(new long[] {1, 1}, new long[] {1, 19});
  }
}
