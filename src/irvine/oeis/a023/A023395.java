package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023395 Only Fermat number divisible by <code>A023394(n)</code> is <code>2^2^a(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023395 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z r = new IntegersModMul(mP).order(Z.TWO);
      if (Z.ONE.equals(r.makeOdd())) {
        return Z.valueOf(r.auxiliary() - 1);
      }
    }
  }
}
