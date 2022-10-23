package irvine.oeis.a059;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A059981 Order of compositeness for the n-th composite number.
 * @author Sean A. Irvine
 */
public class A059981 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mComposites = new A002808();
  private final Map<Integer, Integer> mCToIndex = new HashMap<>();
  private int mN = 0;

  @Override
  public Z next() {
    int c = mComposites.next().intValueExact();
    mCToIndex.put(c, ++mN);
    int cnt = 0;
    while (c != 1 && !mPrime.isPrime(c)) {
      c = mCToIndex.get(c);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
