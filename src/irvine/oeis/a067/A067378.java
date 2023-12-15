package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a084.A084143;

/**
 * A067378 Primes expressible as the sum of (at least two) consecutive primes in at least 2 ways.
 * @author Sean A. Irvine
 */
public class A067378 extends FilterPositionSequence {

  private static final Fast FAST = new Fast();

  /** Construct the sequence. */
  public A067378() {
    super(1, 1, new A084143(), (n, k) -> k.compareTo(Z.ONE) > 0 && FAST.isPrime(n));
  }
}
