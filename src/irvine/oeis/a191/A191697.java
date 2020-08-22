package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191697 a(n) = r1^n + r2^n + r3^n where r1, r2, r3 are the three roots of x^3 - 2*x - 2 = 0.
 * @author Sean A. Irvine
 */
public class A191697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191697() {
    super(new long[] {2, 2, 0}, new long[] {0, 4, 6});
  }
}
