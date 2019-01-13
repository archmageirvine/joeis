package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081913.
 * @author Sean A. Irvine
 */
public class A081913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081913() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 2, 4, 9});
  }
}
