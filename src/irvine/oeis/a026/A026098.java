package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A026098 Triangular array T read by rows: <code>T(1,1)=1, T(2,1)=3, T(2,2)=2</code>; for <code>n &gt;= 3, T(n,1)=prime(n)</code> and for <code>k=2,3,...,n, T(n,k) = m*prime(n+1-k)</code>, where m is the least positive integer such that <code>m*p(n+1-k)</code> is not any <code>T(i,j)</code> for <code>1&lt;=i&lt;=n-1</code> nor any <code>T(n,j)</code> for <code>j&lt;=k-1</code>.
 * @author Sean A. Irvine
 */
public class A026098 implements Sequence {

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
