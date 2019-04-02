package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131555 Period 6: repeat [0, 0, 1, 1, 2, 2].
 * @author Sean A. Irvine
 */
public class A131555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131555() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 0, 1, 1, 2});
  }
}
