package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036542.
 * @author Sean A. Irvine
 */
public class A036542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036542() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 3, 11, 34});
  }
}
