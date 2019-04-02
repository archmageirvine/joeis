package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136305 Transform of A000027 by the T_{1,2} transformation (see link).
 * @author Sean A. Irvine
 */
public class A136305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136305() {
    super(new long[] {1, -2, 3}, new long[] {3, 8, 20});
  }
}
