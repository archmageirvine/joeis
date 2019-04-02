package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041035 Denominators of continued fraction convergents to sqrt(22).
 * @author Sean A. Irvine
 */
public class A041035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041035() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 394, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 13, 29, 42, 365, 407, 1179, 5123, 11425, 16548});
  }
}
