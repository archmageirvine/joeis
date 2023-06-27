package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023554 Convolution of natural numbers &gt;= 3 and (Fib(2), Fib(3), Fib(4), ...).
 * @author Sean A. Irvine
 */
public class A023554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023554() {
    super(1, new long[] {1, -1, -2, 3}, new long[] {3, 10, 22, 43});
  }
}
