package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154127 Period 6: repeat [1, 2, 5, 8, 7, 4].
 * @author Sean A. Irvine
 */
public class A154127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154127() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 2, 5, 8});
  }
}
