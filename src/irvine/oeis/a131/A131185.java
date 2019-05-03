package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131185 Period <code>6</code>: repeat <code>[0, 2, -1, 0, -1, 3]</code>.
 * @author Sean A. Irvine
 */
public class A131185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131185() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 2, -1, 0, -1, 3});
  }
}
