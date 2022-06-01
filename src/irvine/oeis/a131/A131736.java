package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131736 Period 6: repeat [0, 0, 1, -1, -1, 1].
 * @author Sean A. Irvine
 */
public class A131736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131736() {
    super(new long[] {-1, 0, -1, 0}, new long[] {0, 0, 1, -1});
  }
}
