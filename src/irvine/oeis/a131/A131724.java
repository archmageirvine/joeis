package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131724 Period <code>6</code>: repeat <code>[1, 9, 7, 13, 11, 9]</code>.
 * @author Sean A. Irvine
 */
public class A131724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131724() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 9, 7, 13, 11, 9});
  }
}
