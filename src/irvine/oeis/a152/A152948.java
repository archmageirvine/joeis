package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152948.
 * @author Sean A. Irvine
 */
public class A152948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152948() {
    super(new long[] {1, -3, 3}, new long[] {2, 2, 3});
  }
}
