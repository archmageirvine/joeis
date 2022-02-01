package irvine.oeis.a321;

import irvine.math.z.Z;

/**
 * A321552 a(n) = Sum_{d|n} (-1)^(n/d+1)*d^7.
 * @author Georg Fischer
 */
public class A321552 extends A321543 {

  /** Construct the sequence. */
  public A321552() {
    this(7);
  }

  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A321552(final int expon) {
    mF = d -> Z.valueOf(d).pow(expon).multiply((((mK / d + 1) & 1) == 0) ? 1 : -1);
    mK = 0;
  }
}
