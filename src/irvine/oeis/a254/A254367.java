package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254367 a(n) = 5*2^(n+2) + 2^(2n+2) + 10*3^n + 5^n + 35.
 * @author Sean A. Irvine
 */
public class A254367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254367() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {70, 126, 294, 846, 2814});
  }
}
