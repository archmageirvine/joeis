package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A084988 Numbers made with nonprime digits such that the sum of the digits is also not prime.
 * @author Sean A. Irvine
 */
public class A084988 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084988() {
    super(1, k -> (Functions.SYNDROME.i(k) & 0b0010101100) == 0 && !Functions.DIGIT_SUM.z(k).isProbablePrime());
  }
}
