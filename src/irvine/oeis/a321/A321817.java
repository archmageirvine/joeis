package irvine.oeis.a321;

import irvine.math.z.Z;

/**
 * A321817 a(n) = Sum_{d|n, n/d odd} d^6 for n &gt; 0.
 * @author Georg Fischer
 */
public class A321817 extends A321543 {

  /** Construct the sequence. */
  public A321817() {
    this(6);
  }

  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A321817(final int expon) {
    mF = d -> (((mK / d) & 1) == 1) ? Z.valueOf(d).pow(expon) : Z.ZERO;
    mK = 0;
  }
}
