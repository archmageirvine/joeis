package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054967.
 * @author Sean A. Irvine
 */
public class A054967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054967() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 9, 10});
  }
}
