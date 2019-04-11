package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158316 <code>400n^2 - 2n</code>.
 * @author Sean A. Irvine
 */
public class A158316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158316() {
    super(new long[] {1, -3, 3}, new long[] {398, 1596, 3594});
  }
}
