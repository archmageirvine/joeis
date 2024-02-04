package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A013632 Difference between n and the next prime greater than n.
 * @author Sean A. Irvine
 */
public class A013632 extends AbstractSequence implements DirectSequence {

  private final Prime mPrime = new Fast();
  private int mN = -1;

  /** Construct the sequence. */
  public A013632() {
    super(0);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Puma.nextPrime(n) - n);
  }

  @Override
  public Z a(final Z n) {
    return a(Puma.nextPrimeZ(n).subtract(n));
  }

}
