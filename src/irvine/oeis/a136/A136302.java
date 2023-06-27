package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136302 Transform of A000027 by the T_{1,1} transformation (see link).
 * @author Sean A. Irvine
 */
public class A136302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136302() {
    super(1, new long[] {1, -2, 3}, new long[] {2, 6, 15});
  }
}
