package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094361 Pair-reversal of 1,4,4,16,16...
 * @author Sean A. Irvine
 */
public class A094361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094361() {
    super(new long[] {4, 0}, new long[] {4, 1});
  }
}
