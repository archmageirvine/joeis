package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041893 Denominators of continued fraction convergents to <code>sqrt(468)</code>.
 * @author Sean A. Irvine
 */
public class A041893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041893() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1298, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 8, 11, 19, 30, 1279, 1309, 2588, 3897, 10382, 14279, 24661, 38940});
  }
}
