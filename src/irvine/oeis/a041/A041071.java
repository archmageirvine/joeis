package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041071 Denominators of continued fraction convergents to sqrt(42).
 * @author Sean A. Irvine
 */
public class A041071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041071() {
    super(new long[] {-1, 0, 26, 0}, new long[] {1, 2, 25, 52});
  }
}
