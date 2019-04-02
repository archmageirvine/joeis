package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015456 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A015456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015456() {
    super(new long[] {1, 10}, new long[] {1, 1});
  }
}
