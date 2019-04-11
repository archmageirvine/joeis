package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041019 Denominators of continued fraction convergents to <code>sqrt(13)</code>.
 * @author Sean A. Irvine
 */
public class A041019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041019() {
    super(new long[] {1, 0, 0, 0, 0, 36, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 33, 38, 71, 109, 180});
  }
}
