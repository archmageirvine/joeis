package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041473 Denominators of continued fraction convergents to sqrt(252).
 * @author Sean A. Irvine
 */
public class A041473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041473() {
    super(new long[] {-1, 0, 0, 0, 254, 0, 0, 0}, new long[] {1, 1, 7, 8, 247, 255, 1777, 2032});
  }
}
