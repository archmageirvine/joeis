package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023554 Convolution of natural numbers <code>&gt;= 3</code> and <code>(Fib(2), Fib(3), Fib(4), ...)</code>.
 * @author Sean A. Irvine
 */
public class A023554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023554() {
    super(new long[] {1, -1, -2, 3}, new long[] {3, 10, 22, 43});
  }
}
