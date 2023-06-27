package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216755 Digital root of the fifth power of Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A216755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216755() {
    super(1, new long[] {1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 1, 5, 9, 2, 8, 7, 9, 4, 1, 8, 9, 8, 8, 4, 9});
  }
}
