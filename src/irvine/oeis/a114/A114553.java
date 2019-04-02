package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114553 Large integer characteristic polynomial vector Markov sequence.
 * @author Sean A. Irvine
 */
public class A114553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114553() {
    super(new long[] {48, 25, 0}, new long[] {0, 1, 1});
  }
}
