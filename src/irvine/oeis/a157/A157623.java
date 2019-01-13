package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157623.
 * @author Sean A. Irvine
 */
public class A157623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157623() {
    super(new long[] {1, -3, 3}, new long[] {392499, 2281249, 5732499});
  }
}
