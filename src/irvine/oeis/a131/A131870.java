package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131870 Period <code>8</code>: repeat <code>[1, 2, 3, 4, 6, 7, 8, 9]</code>.
 * @author Sean A. Irvine
 */
public class A131870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131870() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 6, 7, 8, 9});
  }
}
