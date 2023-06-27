package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216676 Digital roots of squares of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A216676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216676() {
    super(1, new long[] {1, 0, -1, 0, 0, 0, 1, 0}, new long[] {1, 1, 4, 9, 7, 1, 7, 9});
  }
}
