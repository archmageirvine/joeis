package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136303 Transform of 0 by the reciprocal transformation to <code>T_{1,1}</code> (see link).
 * @author Sean A. Irvine
 */
public class A136303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136303() {
    super(new long[] {1, -4, 8, -9, 5}, new long[] {1, 5, 17, 48, 123});
  }
}
