package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131185 Period 6: repeat [0, 2, -1, 0, -1, 3].
 * @author Sean A. Irvine
 */
public class A131185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131185() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 2, -1, 0, -1, 3});
  }
}
