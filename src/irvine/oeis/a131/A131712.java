package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131712 Period <code>4</code>: repeat <code>[1, 3, 7, 9]</code>.
 * @author Sean A. Irvine
 */
public class A131712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131712() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 3, 7, 9});
  }
}
