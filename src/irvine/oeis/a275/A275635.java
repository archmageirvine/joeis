package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275635 a(n) = (3^n-1)*(3^n-3)*(3^n+3)/4!.
 * @author Sean A. Irvine
 */
public class A275635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275635() {
    super(new long[] {-729, 1080, -390, 40}, new long[] {0, 0, 24, 780});
  }
}
