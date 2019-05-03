package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181668 Period <code>12</code>: repeat <code>[5,5,5,2,2,2,8,8,8,2,2,2]</code>.
 * @author Sean A. Irvine
 */
public class A181668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181668() {
    super(new long[] {1, -1, 0, 1, -1, 0, 1, -1, 0, 1}, new long[] {5, 5, 5, 2, 2, 2, 8, 8, 8, 2});
  }
}
