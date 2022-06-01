package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195041 Concentric heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A195041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195041() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 7, 15});
  }
}
