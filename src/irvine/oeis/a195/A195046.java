package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195046.
 * @author Sean A. Irvine
 */
public class A195046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195046() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 15, 31});
  }
}
