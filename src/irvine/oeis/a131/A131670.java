package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131670 Period <code>5</code>: repeat <code>[1, 0, -1, 0, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131670() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 0, -1, 0, 1});
  }
}
