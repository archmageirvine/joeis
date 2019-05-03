package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014556 Euler's "Lucky" numbers: n such that <code>m^2-m+n</code> is prime for <code>m=0..n-1</code>.
 * @author Sean A. Irvine
 */
public class A014556 extends FiniteSequence {

  /** Construct the sequence. */
  public A014556() {
    super(2, 3, 5, 11, 17, 41);
  }
}
