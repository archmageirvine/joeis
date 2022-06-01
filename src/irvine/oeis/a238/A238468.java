package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238468 Period 7: repeat [0, 0, -1, 1, -1, 1, 0].
 * @author Sean A. Irvine
 */
public class A238468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238468() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {0, 0, -1, 1, -1, 1});
  }
}
