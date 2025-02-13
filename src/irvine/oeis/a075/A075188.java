package irvine.oeis.a075;

import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075188 Number of times that the numerator of a sum generated from the set 1, 1/2, 1/3,..., 1/n is prime.
 * @author Sean A. Irvine
 */
public class A075188 extends Sequence1 {

  private final Map<Q, Integer> mSums = new HashMap<>();
  {
    mSums.put(Q.ZERO, 1);
  }
  private long mPrimeCount = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final Q t = new Q(1, ++mN);
    final Map<Q, Integer> s = new HashMap<>();
    for (final Map.Entry<Q, Integer> e : mSums.entrySet()) {
      final Q v = e.getKey().add(t);
      if (v.num().isProbablePrime()) {
        mPrimeCount += e.getValue();
      }
      s.put(v, e.getValue());
    }
    s.forEach((k, v) -> mSums.merge(k, v, Integer::sum));
    return Z.valueOf(mPrimeCount);
  }
}
