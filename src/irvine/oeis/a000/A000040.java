package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A000040 The prime numbers.
 * @author Sean A. Irvine
 */
public class A000040 extends Sequence1 implements DirectSequence {

  protected Z mP = Z.ONE;
  protected final Fast mPrime = new Fast();

  @Override
  public Z a(final Z n) {
    return Functions.PRIME.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIME.z(n);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return mP;
  }
}

