package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054602.
 * @author Sean A. Irvine
 */
public class A054602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054602() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 12, 33});
  }
}
