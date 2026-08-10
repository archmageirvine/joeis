package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A086210.
 * @author Sean A. Irvine
 */
public class A086248 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086248() {
    super(1, 2, k -> Functions.DIGIT_SORT_DESCENDING.z(k).equals(Functions.DIGIT_SORT_DESCENDING.z(Functions.SIGMA1.z(k).subtract(k + 1))));
  }
}
