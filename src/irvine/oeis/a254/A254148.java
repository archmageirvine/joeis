package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254148 a(n) = 9*2^n + 7*4^n + 3*8^n + 8*3^n + 2*9^n + 6*5^n + 5*6^n + 4*7^n + 10^n + 10.
 * @author Sean A. Irvine
 */
public class A254148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254148() {
    super(new long[] {-3628800, 10628640, -12753576, 8409500, -3416930, 902055, -157773, 18150, -1320, 55}, new long[] {55, 220, 1210, 7942, 57838, 450670, 3682030, 31153342, 270739678, 2403012910L});
  }
}
