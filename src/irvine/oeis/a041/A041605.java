package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041605 Denominators of continued fraction convergents to sqrt(320).
 * @author Sean A. Irvine
 */
public class A041605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041605() {
    super(new long[] {-1, 0, 0, 0, 322, 0, 0, 0}, new long[] {1, 1, 8, 9, 314, 323, 2575, 2898});
  }
}
