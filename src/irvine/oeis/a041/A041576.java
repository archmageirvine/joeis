package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041576 Numerators of continued fraction convergents to sqrt(306).
 * @author Sean A. Irvine
 */
public class A041576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041576() {
    super(new long[] {-1, 0, 70, 0}, new long[] {17, 35, 1207, 2449});
  }
}
