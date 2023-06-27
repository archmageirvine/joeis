package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131531 Period 6: repeat [0, 0, 1, 0, 0, -1].
 * @author Sean A. Irvine
 */
public class A131531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131531() {
    super(1, new long[] {-1, 0, 0}, new long[] {0, 0, 1});
  }
}
