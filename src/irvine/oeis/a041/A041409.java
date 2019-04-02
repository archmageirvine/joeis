package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041409 Denominators of continued fraction convergents to sqrt(219).
 * @author Sean A. Irvine
 */
public class A041409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041409() {
    super(new long[] {-1, 0, 0, 0, 148, 0, 0, 0}, new long[] {1, 1, 4, 5, 144, 149, 591, 740});
  }
}
