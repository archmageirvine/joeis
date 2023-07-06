package irvine.oeis.a298;
// manually ajrank at 2021-09-24 22:11

import irvine.oeis.RankSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001747;

/**
 * A298862 Rank of n-th twice-prime when all the primes and twice-primes are jointly ranked.
 * @author Georg Fischer
 */
public class A298862 extends RankSequence {

  /** Construct the sequence. */
  public A298862() {
    super(new A000040(), new A001747().skip(1), 0, 2);
  }
}
