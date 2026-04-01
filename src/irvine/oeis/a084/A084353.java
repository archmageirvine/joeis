package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A084353 Palindromes such that the product of the nonzero digits + 1 is prime.
 * @author Sean A. Irvine
 */
public class A084353 extends FilterSequence {

  /** Construct the sequence. */
  public A084353() {
    super(1, new A002113().skip(), k -> Functions.DIGIT_NZ_PRODUCT.z(k).add(1).isProbablePrime());
  }
}

