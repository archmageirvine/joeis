package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157681 Fibonacci sequence beginning 29, 31.
 * @author Sean A. Irvine
 */
public class A157681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157681() {
    super(1, new long[] {1, 1}, new long[] {29, 31});
  }
}
