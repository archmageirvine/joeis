package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270823 Period 16: repeat [0,2,3,1,1,3,2,0,1,3,2,0,0,2,3,1].
 * @author Sean A. Irvine
 */
public class A270823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270823() {
    super(new long[] {1, -1, 1, -1, 0, 0, 0, 0, 1, -1, 1}, new long[] {0, 2, 3, 1, 1, 3, 2, 0, 1, 3, 2});
  }
}
