package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005579 Least number of distinct prime factors in even numbers having <code>an</code> abundancy index <code>&gt; n</code>.
 * @author Sean A. Irvine
 */
public class A005579 implements Sequence {

  private long mN = 1;
  private long mK;
  private Q mProd = Q.ONE;
  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Q n = new Q(++mN);
    while (mProd.compareTo(n) <= 0) {
      ++mK;
      mP = mPrime.nextPrime(mP);
      mProd = mProd.multiply(new Q(mP, mP.subtract(1)));
    }
    return Z.valueOf(mK);
  }
}

