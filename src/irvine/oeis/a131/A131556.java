package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131556 Period 6: repeat <code>[1, -2, 1, -1, 2, -1]</code>.
 * @author Sean A. Irvine
 */
public class A131556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131556() {
    super(new long[] {-1, 0, 0}, new long[] {1, -2, 1});
  }
}
