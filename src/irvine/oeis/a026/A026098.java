package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A026098 Triangular array T read by rows: T(1,1)=1, T(2,1)=3, T(2,2)=2; for n &gt;= 3, T(n,1)=prime(n) and for k=2,3,...,n, T(n,k) = m*prime(n+1-k), where m is the least positive integer such that m*p(n+1-k) is not any T(i,j) for 1&lt;=i&lt;=n-1 nor any T(n,j) for j&lt;=k-1.
 * @author Sean A. Irvine
 */
public class A026098 extends Sequence1 {

  // A map to support A026099 and A026100
  protected final TreeMap<Z, Pair<Long, Long>> mUsed = new TreeMap<>();
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;
  private Z mQ = Z.TWO;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 1;
      if (++mN == 1) {
        mUsed.put(Z.ONE, new Pair<>(1L, 1L));
        return Z.ONE;
      }
      mP = mPrime.nextPrime(mP);
      mQ = Z.valueOf(mP);
      final Z p = Z.valueOf(mP);
      mUsed.put(p, new Pair<>(mN, mM));
      return p;
    }
    mQ = mPrime.prevPrime(mQ);
    long k = 0;
    Z t;
    while (mUsed.containsKey(t = mQ.multiply(++k))) {
      // do nothing
    }
    mUsed.put(t, new Pair<>(mN, mM));
    return t;
  }
}
