package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123231 Row sums of A123230.
 * @author Sean A. Irvine
 */
public class A123231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123231() {
    super(1, new long[] {1, 0, 1, 0}, new long[] {1, 2, 1, 3});
  }
}
