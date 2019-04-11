package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254146 <code>a(n) = 1*8^n + 2*7^n + 3*6^n + 4*5^n + 5*4^n + 6*3^n + 7*2^n + 8*1^n</code>.
 * @author Sean A. Irvine
 */
public class A254146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254146() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {36, 120, 540, 2892, 17172, 109020, 725220, 4992492});
  }
}
