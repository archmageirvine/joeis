package irvine.oeis.a321;

import irvine.math.z.Z;

/**
 * A321558 a(n) = Sum_{d divides n} (-1)^(d + n/d) * d^2.
 * @author Georg Fischer
 */
public class A321558 extends A321543 {

  /** Construct the sequence. */
  public A321558() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A321558(final int expon) {
    mF = d -> Z.valueOf(d).pow(expon).multiply((((d + mK / d) & 1) == 0) ? 1 : -1);
    mK = 0;
  }
}
