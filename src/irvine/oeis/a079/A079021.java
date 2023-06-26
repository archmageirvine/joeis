package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079021 Suppose p and q = p+22 are primes. Define the difference pattern of (p,q) to be the successive differences of the primes in the range p to q. There are 51 possible difference patterns, shown in the Comments line. Sequence gives smallest value of p for each difference pattern, sorted by magnitude.
 * @author Georg Fischer
 */
public class A079021 extends FiniteSequence {

  /** Construct the sequence. */
  public A079021() {
    super(1, FINITE, 7, 19, 31, 37, 61, 67, 79, 109, 127, 151, 157, 211, 241, 271, 331, 337, 397, 409, 421, 457, 487, 499, 541, 619, 661, 739, 751, 787, 919, 991, 1069, 1129, 1471, 1531, 1597, 1867, 2221, 2287, 2671, 2707, 2797, 2857, 3187, 3301, 3391, 3637, 4651, 6547, 12637, 17011, 90001);
  }
}
