package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014556 Euler's "Lucky" numbers: n such that m^2-m+n is prime for m=0..n-1.
 * @author Sean A. Irvine
 */
public class A014556 extends FiniteSequence {

  /** Construct the sequence. */
  public A014556() {
    super(1, FINITE, 2, 3, 5, 11, 17, 41);
  }
}
