package irvine.oeis.a196;

import irvine.oeis.FiniteSequence;

/**
 * A196230 Euler primes: values of <code>x^2 - x + k</code> for <code>x = 1..k-1,</code> where k is one of Euler's "lucky" numbers 2, 3, 5, 11, 17, 41.
 * @author Georg Fischer
 */
public class A196230 extends FiniteSequence {

  /** Construct the sequence. */
  public A196230() {
    super(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 83, 89, 97, 101, 107, 113, 127, 131, 149, 151, 173, 197, 199, 223, 227, 251, 257, 281, 313, 347, 383, 421, 461, 503, 547, 593, 641, 691, 743, 797, 853, 911, 971, 1033, 1097, 1163, 1231, 1301, 1373, 1447, 1523, 1601);
  }
}
