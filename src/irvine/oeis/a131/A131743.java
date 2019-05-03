package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131743 Period <code>4</code>: repeat <code>[0, 1, 0, 2]</code>.
 * @author Sean A. Irvine
 */
public class A131743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131743() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 0, 2});
  }
}
