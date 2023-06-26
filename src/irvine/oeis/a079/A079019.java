package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079019 Suppose p and q = p+18 are primes. Define the difference pattern of (p,q) to be the successive differences of the primes in the range p to q. There are 49 possible difference patterns, shown in the Comments line. Sequence gives smallest value of p for each difference pattern, sorted by magnitude.
 * @author Georg Fischer
 */
public class A079019 extends FiniteSequence {

  /** Construct the sequence. */
  public A079019() {
    super(1, FINITE, 5, 11, 13, 19, 23, 29, 41, 43, 61, 71, 79, 83, 89, 109, 113, 131, 139, 149, 179, 181, 193, 211, 239, 251, 331, 401, 461, 491, 503, 523, 569, 601, 659, 691, 733, 739, 743, 821, 1303, 1531, 1601, 1861, 1931, 1933, 1993, 2069, 3313, 4201, 18043);
  }
}
