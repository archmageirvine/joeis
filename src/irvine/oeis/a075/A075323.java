package irvine.oeis.a075;

import irvine.oeis.AlternatingSequence;

/**
 * A075323 Pair the odd primes so that the n-th pair is (p, p+2n) where p is the smallest prime not included earlier such that p and p+2n are primes and p+2n also does not occur earlier: (3, 5), (7, 11), (13, 19), (23, 31), (37, 47), (17, 29), ... This lists the successive pairs in order.
 * @author Sean A. Irvine
 */
public class A075323 extends AlternatingSequence {

  /** Construct the sequence. */
  public A075323() {
    super(1, new A075321(), new A075322());
  }
}
