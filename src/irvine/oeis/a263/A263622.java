package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263622.
 * @author Sean A. Irvine
 */
public class A263622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263622() {
    super(new long[] {-6, 17, -17, 7}, new long[] {0, 1, 4, 14});
  }
}
