package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A084979 Palindromes such that the product of the digits + 1 is prime.
 * @author Sean A. Irvine
 */
public class A084979 extends FilterSequence {

  /** Construct the sequence. */
  public A084979() {
    super(1, new A002113(), k -> Functions.DIGIT_PRODUCT.z(k).add(1).isProbablePrime());
  }
}
