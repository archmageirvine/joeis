package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015457 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A015457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015457() {
    super(new long[] {1, 11}, new long[] {1, 1});
  }
}
