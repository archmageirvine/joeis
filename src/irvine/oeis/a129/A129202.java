package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129202 Denominator of <code>3*(3+(-1)^n) / (n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A129202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129202() {
    super(new long[] {1, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 25, 6, 49, 32, 27, 50, 121, 24, 169, 98, 75, 128, 289, 54});
  }
}
