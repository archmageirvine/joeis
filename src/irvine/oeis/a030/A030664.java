package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030664 Product of largest prime <code>&lt;= n</code> and smallest prime <code>&gt;= n</code>.
 * @author Sean A. Irvine
 */
public class A030664 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ONE : Z.valueOf(mPrime.prevPrime(mN + 1)).multiply(mPrime.nextPrime(mN - 1));
  }
}

