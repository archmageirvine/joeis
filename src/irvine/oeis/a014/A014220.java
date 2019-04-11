package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014220 Next prime after <code>n^3</code>.
 * @author Sean A. Irvine
 */
public class A014220 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mPrime.nextPrime(mN.pow(3));
  }
}
