package irvine.oeis.a298;
// manually ajrank at 2021-09-24 22:11

import irvine.oeis.RankSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001747;

/**
 * A298861 Rank of n-th prime when all the primes and twice-primes are jointly ranked.
 * @author Georg Fischer
 */
public class A298861 extends RankSequence {

  /** Construct the sequence. */
  public A298861() {
    super(new A000040(), new SkipSequence(new A001747(), 1), 0, 1);
  }
}
