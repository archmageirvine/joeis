package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078872 The quintuples (d1,d2,d3,d4,d5) with elements in <code>{2,4,6}</code> are listed in lexicographic order; for each quintuple, this sequence lists the smallest prime p <code>&gt;= 7</code> such that the differences between the 6 consecutive primes starting with p are (d1,d2,d3,d4,d5), if such a prime exists.
 * @author Georg Fischer
 */
public class A078872 extends FiniteSequence {

  /** Construct the sequence. */
  public A078872() {
    super(11, 17, 41, 29, 59, 5849, 6959, 599, 149, 3299, 7, 13, 37, 67, 1597, 19, 4639, 43, 17467, 1601, 23, 2333, 593, 6353, 1861, 31, 61, 90001, 32353, 157, 14731, 47, 587, 2671, 3307, 151, 251, 3301);
  }
}
