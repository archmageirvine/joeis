package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041909 Denominators of continued fraction convergents to sqrt(476).
 * @author Sean A. Irvine
 */
public class A041909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041909() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 57598, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 11, 115, 241, 1079, 1320, 56519, 57839, 287875, 633589, 6623765, 13881119, 62148241, 76029360});
  }
}
