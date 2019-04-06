package irvine.oeis.a323;

import irvine.oeis.FiniteSequence;

/**
 * A323579 Primes formed by using the four terminal digits of multidigit primes and whose digits are distinct, i.e., consisting of only digits 1, 3, 7, 9.
 * @author Georg Fischer
 */
public class A323579 extends FiniteSequence {

  /** Construct the sequence. */
  public A323579() {
    super(3, 7, 13, 17, 19, 31, 37, 71, 73, 79, 97, 137, 139, 173, 179, 193, 197, 317, 379, 397, 719, 739, 937, 971, 1973, 3719, 3917, 7193, 9137, 9173, 9371);
  }
}
