package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041703 Denominators of continued fraction convergents to sqrt(371).
 * @author Sean A. Irvine
 */
public class A041703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041703() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3390, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 19, 23, 88, 3367, 10189, 13556, 64413, 77969, 298320});
  }
}
