package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A085844 Numbers equal to a permutation (or rearrangement) of the digits of the sum of their proper divisors. Rearrangements which cause leading zeros are excluded.
 * @author Sean A. Irvine
 */
public class A085844 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085844() {
    super(1, k -> Functions.DIGIT_SORT_DESCENDING.z(k).equals(Functions.DIGIT_SORT_DESCENDING.z(Functions.SIGMA1.z(k).subtract(k))));
  }
}
