package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131556.
 * @author Sean A. Irvine
 */
public class A131556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131556() {
    super(new long[] {-1, 0, 0}, new long[] {1, -2, 1});
  }
}
