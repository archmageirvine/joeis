package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054603.
 * @author Sean A. Irvine
 */
public class A054603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054603() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 24, 96, 280});
  }
}
