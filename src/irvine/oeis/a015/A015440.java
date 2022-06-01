package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015440 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A015440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015440() {
    super(new long[] {5, 1}, new long[] {1, 1});
  }
}
