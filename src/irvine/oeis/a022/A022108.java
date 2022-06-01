package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022108 Fibonacci sequence beginning 1, 18.
 * @author Sean A. Irvine
 */
public class A022108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022108() {
    super(new long[] {1, 1}, new long[] {1, 18});
  }
}
