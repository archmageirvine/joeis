package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022371 Fibonacci sequence beginning 2, 18.
 * @author Sean A. Irvine
 */
public class A022371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022371() {
    super(new long[] {1, 1}, new long[] {2, 18});
  }
}
