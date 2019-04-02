package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014664 Order of 2 modulo the n-th prime.
 * @author Sean A. Irvine
 */
public class A014664 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return new IntegersModMul(mP).order(Z.TWO);
  }
}

