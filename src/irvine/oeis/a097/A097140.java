package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097140 Interleave n and <code>1-n</code>.
 * @author Sean A. Irvine
 */
public class A097140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097140() {
    super(new long[] {1, 1, -1}, new long[] {0, 1, 1});
  }
}
