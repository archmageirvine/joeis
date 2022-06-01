package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131720 Period 6: repeat [0, 1, -1, 1, -1, 0].
 * @author Sean A. Irvine
 */
public class A131720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131720() {
    super(new long[] {-1, -1, -1, -1, -1}, new long[] {0, 1, -1, 1, -1});
  }
}
