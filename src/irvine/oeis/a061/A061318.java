package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061318 Column 3 of A061314.
 * @author Sean A. Irvine
 */
public class A061318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061318() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 4, 40, 304, 1720, 7480, 26404, 79240, 209304});
  }
}
