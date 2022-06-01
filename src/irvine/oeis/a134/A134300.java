package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134300 Period 8: repeat [6,-4,2,-1,2,-4,6,-7].
 * @author Sean A. Irvine
 */
public class A134300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134300() {
    super(new long[] {-1, -1, 0, 0, -1}, new long[] {6, -4, 2, -1, 2});
  }
}
