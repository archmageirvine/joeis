package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254370 a(n) = 35*2^n + 5*4^n + 15*3^n + 5^n + 70.
 * @author Sean A. Irvine
 */
public class A254370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254370() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {126, 210, 450, 1200, 3750});
  }
}
