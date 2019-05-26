package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023049 Smallest prime <code>&gt; n</code> having primitive root n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A023049 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;
  private long mB = 1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mA.equals(mN)) {
      mA = Z.valueOf(++mB).square();
      return Z.ONE.equals(mN) ? Z.TWO : Z.ZERO;
    }
    Z p = mN;
    do {
      p = mPrime.nextPrime(p);
    } while (!new IntegersModMul(p).order(mN).equals(p.subtract(1)));
    return p;
  }
}
