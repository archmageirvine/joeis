package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157266.
 * @author Sean A. Irvine
 */
public class A157266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157266() {
    super(new long[] {-1, 2}, new long[] {1320, 3048});
  }
}
