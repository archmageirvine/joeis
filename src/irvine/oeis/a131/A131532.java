package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131532 Period 6: repeat <code>[0, 0, 0, 0, 1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131532() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
