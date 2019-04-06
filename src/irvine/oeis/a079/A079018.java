package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079018 Suppose p and q = p+16 are primes. Define the difference pattern of (p,q) to be the successive differences of the primes in the range p to q. There are 17 possible difference patterns, namely [16], [4,12], [6,10], [10,6], [12,4], [4,2,10], [4,6,6], [4,8,4], [6,4,6], [6,6,4], [10,2,4], [4,2,4,6], [4,2,6,4], [4,6,2,4], [6,4,2,4], [4,2,4,2,4], [2,2,4,2,4,2]. Sequence gives smallest value of p for each difference pattern, sorted by magnitude.
 * @author Georg Fischer
 */
public class A079018 extends FiniteSequence {

  /** Construct the sequence. */
  public A079018() {
    super(3, 7, 13, 31, 43, 67, 73, 151, 181, 211, 241, 277, 331, 463, 487, 1597, 1831);
  }
}
