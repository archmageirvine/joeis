package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254147 <code>a(n) = 1*9^n + 2*8^n + 3*7^n + 4*6^n + 5*5^n + 6*4^n + 7*3^n + 8*2^n + 9*1^n</code>.
 * @author Sean A. Irvine
 */
public class A254147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254147() {
    super(new long[] {362880, -1026576, 1172700, -723680, 269325, -63273, 9450, -870, 45}, new long[] {45, 165, 825, 4917, 32505, 229845, 1703625, 13072917, 103008345});
  }
}
