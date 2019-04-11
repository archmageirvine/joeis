package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177049 Numerator of <code>(3n+1)*(3n+2)/4</code>.
 * @author Sean A. Irvine
 */
public class A177049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177049() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {1, 5, 14, 55, 91, 68, 95, 253, 325});
  }
}
