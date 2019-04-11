package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079017 Suppose p and q = p+14 are primes. Define the difference pattern of (p,q) to be the successive differences of the primes in the range p to q. There are 15 possible difference patterns, namely <code>[14], [2,12], [6,8], [8,6], [12,2], [2,4,8], [2,6,6], [2,10,2], [6,2,6], [6,6,2], [8,4,2], [2,4,6,2], [2,6,4,2], [2,2,4,2,4], [2,4,2,4,2].</code> Sequence gives smallest value of p for each difference pattern, sorted by magnitude.
 * @author Georg Fischer
 */
public class A079017 extends FiniteSequence {

  /** Construct the sequence. */
  public A079017() {
    super(3, 5, 17, 23, 29, 47, 83, 89, 113, 137, 149, 197, 359, 509, 1997);
  }
}
