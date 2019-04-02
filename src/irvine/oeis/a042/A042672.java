package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042672 Numerators of continued fraction convergents to sqrt(866).
 * @author Sean A. Irvine
 */
public class A042672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042672() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 84870, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 59, 147, 206, 5915, 6121, 18157, 42435, 2479387, 5001209, 12481805, 17483014, 502006197, 519489211, 1540984619, 3601458449L});
  }
}
