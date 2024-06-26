package irvine.oeis.a336;
// Generated by gen_seq4.pl 2024-01-15/filtpos at 2024-01-26 21:00

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001222;

/**
 * A336360 Numbers k for which bigomega(sigma(k)) &gt;= bigomega(k), where bigomega (A001222) gives the number of prime factors with multiplicity, and sigma (A000203) gives the sum of divisors.
 * @author Georg Fischer
 */
public class A336360 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A336360() {
    super(1, 1, new A001222(), (k, v) -> v.compareTo(Functions.BIG_OMEGA.z(Functions.SIGMA1.z(k))) <= 0);
  }
}
