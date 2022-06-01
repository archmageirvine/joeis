package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108362 Pair reversal of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A108362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108362() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 0, 2, 1});
  }
}
