package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144900 Expansion of <code>x/((1-x-x^3)*(1-x)^6)</code>.
 * @author Sean A. Irvine
 */
public class A144900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144900() {
    super(new long[] {1, -6, 16, -27, 36, -41, 36, -21, 7}, new long[] {0, 1, 7, 28, 85, 218, 498, 1045, 2055});
  }
}
