package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206927.
 * @author Sean A. Irvine
 */
public class A206927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206927() {
    super(new long[] {-2, 1, 0, 0, 0, 0, 2}, new long[] {2, 4, 9, 18, 37, 75, 150});
  }
}
