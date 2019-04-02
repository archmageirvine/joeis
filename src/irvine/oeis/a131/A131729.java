package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131729 Period 4: repeat [0, 1, -1, 1].
 * @author Sean A. Irvine
 */
public class A131729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131729() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, -1, 1});
  }
}
