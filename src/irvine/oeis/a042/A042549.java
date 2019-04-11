package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042549 Denominators of continued fraction convergents to <code>sqrt(803)</code>.
 * @author Sean A. Irvine
 */
public class A042549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042549() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 14452, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 83, 86, 255, 14366, 28987, 43353, 1199518, 1242871, 3685260});
  }
}
