package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192858 Hosoya indices of the 2n-wheel graphs W_{2n}.
 * @author Sean A. Irvine
 */
public class A192858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192858() {
    super(new long[] {-1, 6, -11, 6}, new long[] {2, 10, 36, 120});
  }
}
