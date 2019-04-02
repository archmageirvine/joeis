package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015454 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A015454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015454() {
    super(new long[] {1, 8}, new long[] {1, 1});
  }
}
