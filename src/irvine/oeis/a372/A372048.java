package irvine.oeis.a372;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A372048 The index of the largest Fibonacci number that divides the sum of Fibonacci numbers with indices 1 through n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A372048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A372048() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {2, 3, 2, 2});
  }
}
