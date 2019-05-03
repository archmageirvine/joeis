package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131554 Period <code>5</code>: repeat <code>[1, 1, -1, 1, -1]</code>.
 * @author Sean A. Irvine
 */
public class A131554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131554() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, -1, 1, -1});
  }
}
