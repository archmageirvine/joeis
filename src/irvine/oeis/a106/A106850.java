package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106850.
 * @author Sean A. Irvine
 */
public class A106850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106850() {
    super(new long[] {9, 0, -25, 10}, new long[] {0, 6, 33, 174});
  }
}
