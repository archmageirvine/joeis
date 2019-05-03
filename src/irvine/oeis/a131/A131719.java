package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131719 Period <code>6</code>: repeat <code>[0, 1, 1, 1, 1, 0]</code>.
 * @author Sean A. Irvine
 */
public class A131719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131719() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 1, 1});
  }
}
