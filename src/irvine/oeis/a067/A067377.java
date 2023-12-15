package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a084.A084143;

/**
 * A067377 Primes expressible as the sum of (at least two) consecutive primes in at least 1 way.
 * @author Sean A. Irvine
 */
public class A067377 extends FilterPositionSequence {

  private static final Fast FAST = new Fast();

  /** Construct the sequence. */
  public A067377() {
    super(1, 1, new A084143(), (n, k) -> k.signum() > 0 && FAST.isPrime(n));
  }
}
