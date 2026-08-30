package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A086379 Numbers such that both 1 + sum of digits and 1 + product of digits are prime.
 * @author Sean A. Irvine
 */
public class A086379 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086379() {
    super(1, k -> Functions.DIGIT_SUM.z(k).add(1).isProbablePrime() && Functions.DIGIT_PRODUCT.z(k).add(1).isProbablePrime());
  }
}

