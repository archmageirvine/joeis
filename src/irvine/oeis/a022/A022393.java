package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022393 Fibonacci sequence beginning 1, 23.
 * @author Sean A. Irvine
 */
public class A022393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022393() {
    super(new long[] {1, 1}, new long[] {1, 23});
  }
}
