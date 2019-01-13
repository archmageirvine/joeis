package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253207.
 * @author Sean A. Irvine
 */
public class A253207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253207() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {11, 59, 359, 1799, 7091, 22995, 64143, 159093, 359348});
  }
}
