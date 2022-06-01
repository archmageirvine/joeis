package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015453 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A015453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015453() {
    super(new long[] {1, 7}, new long[] {1, 1});
  }
}
