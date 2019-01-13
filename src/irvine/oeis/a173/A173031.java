package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173031.
 * @author Sean A. Irvine
 */
public class A173031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173031() {
    super(new long[] {-4, 4, 7, -12, 6}, new long[] {1, 6, 24, 79, 232});
  }
}
