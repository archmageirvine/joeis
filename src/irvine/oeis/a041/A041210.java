package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041210 Numerators of continued fraction convergents to sqrt(116).
 * @author Sean A. Irvine
 */
public class A041210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041210() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19602, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 11, 43, 97, 140, 657, 797, 2251, 7550, 9801, 203570, 213371, 843683, 1900737, 2744420, 12878417, 15622837, 44124091, 147995110, 192119201});
  }
}
