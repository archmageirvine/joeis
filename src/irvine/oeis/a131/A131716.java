package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131716 Period <code>6</code>: repeat <code>[0, 1, 2, 5, 8, 9]</code>.
 * @author Sean A. Irvine
 */
public class A131716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131716() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 5, 8, 9});
  }
}
