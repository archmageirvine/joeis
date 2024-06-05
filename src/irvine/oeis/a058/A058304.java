package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A058304 Continued fraction for Liouville's number (A012245).
 * @author Georg Fischer
 */
public class A058304 extends FoldedContinuedFraction {

  /** Construct the sequence. */
  public A058304() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param m base for Liouville&apos;s number
   */
  public A058304(final int m) {
    super(0, k -> Z.valueOf(m).pow(Functions.FACTORIAL.z(k + 1).multiply(k)), 0, m - 1, m + 1);
  }
}
