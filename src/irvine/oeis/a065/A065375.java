package irvine.oeis.a065;

import irvine.math.cr.CR;

/**
 * A065375 The next smallest pair of numbers is taken so that a(2n-1)/a(2n) converges to sqrt(2).
 * @author Sean A. Irvine
 */
public class A065375 extends A065370 {

  /** Construct the sequence. */
  public A065375() {
    super(CR.SQRT2);
  }
}
