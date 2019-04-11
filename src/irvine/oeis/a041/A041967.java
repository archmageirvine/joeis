package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041967 Denominators of continued fraction convergents to <code>sqrt(506)</code>.
 * @author Sean A. Irvine
 */
public class A041967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041967() {
    super(new long[] {-1, 0, 90, 0}, new long[] {1, 2, 89, 180});
  }
}
