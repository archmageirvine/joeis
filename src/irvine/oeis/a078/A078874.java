package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078874 The 6-tuples (d1,d2,d3,d4,d5,d6) with elements in {2,4,6} are listed in lexicographic order; for each 6-tuple, this sequence lists the smallest prime p &gt;= 7 such that the differences between the 7 consecutive primes starting with p are (d1,d2,d3,d4,d5,d6), if such a prime exists.
 * @author Georg Fischer
 */
public class A078874 extends FiniteSequence {

  /** Construct the sequence. */
  public A078874() {
    super(11, 17, 4637, 41, 5639, 29, 59, 130631, 78779, 603899, 149, 3299, 13, 37, 1597, 19, 5839, 135589, 71329, 43, 302563, 17467, 1601, 23, 53, 5843, 326993, 593, 135593, 71333, 44257, 31, 61, 678631, 32353, 435553, 6268957, 351031, 47, 41597, 587, 19457, 2671, 246907, 151, 251, 179801, 3301);
  }
}
