package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100119 a(n) = n-th centered n-gonal number.
 * @author Sean A. Irvine
 */
public class A100119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100119() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 7, 19});
  }
}
