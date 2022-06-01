package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015441 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A015441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015441() {
    super(new long[] {6, 1}, new long[] {0, 1});
  }
}
