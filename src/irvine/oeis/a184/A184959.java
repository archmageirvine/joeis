package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184959 Fibonacci sequence beginning 10, 9.
 * @author Sean A. Irvine
 */
public class A184959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184959() {
    super(new long[] {1, 1}, new long[] {10, 9});
  }
}
