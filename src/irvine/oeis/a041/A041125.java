package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041125 Denominators of continued fraction convergents to sqrt(71).
 * @author Sean A. Irvine
 */
public class A041125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041125() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 6960, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 7, 54, 61, 176, 413, 6784, 13981, 34746, 48727, 375835, 424562, 1224959, 2874480});
  }
}
