package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041360 Numerators of continued fraction convergents to sqrt(194).
 * @author Sean A. Irvine
 */
public class A041360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041360() {
    super(new long[] {-1, 0, 0, 0, 390, 0, 0, 0}, new long[] {13, 14, 181, 195, 5251, 5446, 70603, 76049});
  }
}
