package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078866 The quadruples (d1,d2,d3,d4) with elements in {2,4,6} are listed in lexicographic order; for each quadruple, this sequence lists the smallest prime p &gt;= 5 such that the differences between the 5 consecutive primes starting with p are (d1,d2,d3,d4), if such a prime exists.
 * @author Georg Fischer
 */
public class A078866 extends FiniteSequence {

  /** Construct the sequence. */
  public A078866() {
    super(5, 17, 41, 29, 71, 149, 3299, 7, 13, 67, 1597, 19, 43, 12637, 1601, 23, 593, 31, 61, 3313, 157, 47, 601, 151, 251, 3301);
  }
}
