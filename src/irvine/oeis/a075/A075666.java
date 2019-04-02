package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075666 Sum of next n 5th powers.
 * @author Sean A. Irvine
 */
public class A075666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075666() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 275, 11925, 208624, 2078375, 14118201, 72758875, 304553600, 1084203549, 3390961375L, 9540835601L, 24582546000L});
  }
}
