package irvine.oeis.a161;
// Generated by gen_seq4.pl A161026/partcap1 at 2022-07-06 21:37

import irvine.math.z.Binomial;

/**
 * A161240 Number of partitions of n into central binomial coefficients A001405.
 * @author Georg Fischer
 */
public class A161240 extends A161026 {

  /** Construct the sequence. */
  public A161240() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param appears how often every part appears
   */
  public A161240(final int offset, final int appears) {
    super(offset, appears, 1, n -> Binomial.binomial(n, n / 2).intValue());
  }
}
