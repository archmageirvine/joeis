package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136302 Transform of <code>A000027</code> by the <code>T_{1,1}</code> transformation (see link).
 * @author Sean A. Irvine
 */
public class A136302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136302() {
    super(new long[] {1, -2, 3}, new long[] {2, 6, 15});
  }
}
