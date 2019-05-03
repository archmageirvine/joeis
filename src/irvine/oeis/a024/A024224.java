package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024224 <code>a(n) = floor((4th</code> elementary symmetric function of S(n))/(3rd elementary symmetric function of <code>S(n)))</code>, where <code>S(n) =</code> {first <code>n+3</code> positive integers congruent to <code>1 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024224() {
    super(new long[] {1, -3, 4, -4, 4, -4, 4, -4, 3}, new long[] {0, 2, 4, 7, 11, 16, 22, 28, 35});
  }
}
