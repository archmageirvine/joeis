package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007014 Largest prime <code>&lt;=</code> Product <code>prime(k)</code>.
 * @author Sean A. Irvine
 */
public class A007014 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mProduct = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mProduct = mProduct.multiply(mP);
    return mPrime.prevPrime(mProduct.add(1));
  }
}

