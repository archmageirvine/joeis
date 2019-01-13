package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136305.
 * @author Sean A. Irvine
 */
public class A136305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136305() {
    super(new long[] {1, -2, 3}, new long[] {3, 8, 20});
  }
}
