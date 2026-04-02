package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A084354 Primes whose product of nonzero digits + 1 is prime.
 * @author Sean A. Irvine
 */
public class A084354 extends FilterSequence {

  /** Construct the sequence. */
  public A084354() {
    super(1, new A000040(), k -> Functions.DIGIT_NZ_PRODUCT.z(k).add(1).isProbablePrime());
  }
}

