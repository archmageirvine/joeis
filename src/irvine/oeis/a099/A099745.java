package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099745.
 * @author Sean A. Irvine
 */
public class A099745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099745() {
    super(new long[] {-1296, 4320, -6264, 5160, -2641, 860, -174, 20}, new long[] {0, 0, 0, 0, 12, 168, 1409, 9187});
  }
}
