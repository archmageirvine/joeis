package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165211 Period <code>8</code>: repeat 0,1,0,1,1,0,1,0.
 * @author Sean A. Irvine
 */
public class A165211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165211() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {0, 1, 0, 1, 1});
  }
}
