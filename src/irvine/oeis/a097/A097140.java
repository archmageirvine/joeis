package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097140 Interleave n and 1-n.
 * @author Sean A. Irvine
 */
public class A097140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097140() {
    super(new long[] {1, 1, -1}, new long[] {0, 1, 1});
  }
}
