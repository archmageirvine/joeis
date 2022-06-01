package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110693 Kekul\u00e9 numbers for certain benzenoids.
 * @author Sean A. Irvine
 */
public class A110693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110693() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 36, 448, 3175, 15786, 61446, 199872, 566676, 1441275, 3356782});
  }
}
