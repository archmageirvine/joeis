package irvine.oeis.a321;

import irvine.math.z.Z;

/**
 * A321829 a(n) = Sum_{d|n, n/d==1 mod 4} d^5 - Sum_{d|n, n/d==3 mod 4} d^5.
 * @author Georg Fischer
 */
public class A321829 extends A321821 {

  /** Construct the sequence. */
  public A321829() {
    this(5);
  }

  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A321829(final int expon) {
    mF = d -> (mK / d % 4 == 1) ? Z.valueOf(d).pow(expon) : Z.ZERO;
    mG = d -> (mK / d % 4 == 3) ? Z.valueOf(d).pow(expon) : Z.ZERO;
    mK = 0;
  }
}
