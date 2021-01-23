package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131554 Period 5: repeat [1, 1, -1, 1, -1].
 * @author Sean A. Irvine
 */
public class A131554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131554() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, -1, 1, -1});
  }
}
