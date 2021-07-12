package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001221;
import irvine.util.array.DynamicLongArray;

/**
 * A048932 Let d(n) = number of distinct primes dividing n (A001221). Find smallest t such that d(t)=d(t+1)=...=d(t+n-1) but d(t-1) and d(t+n) are not = d(t); then a(n)=t.
 * @author Sean A. Irvine
 */
public class A048932 extends A001221 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mM = 0;
  private Z mT = super.next();

  @Override
  public Z next() {
    ++mM;
    while (mA.get(mM) == 0) {
      final Z t = mT;
      int cnt = 0;
      do {
        mT = super.next();
        ++cnt;
      } while (mT.equals(t));
      if (mA.get(cnt) == 0) {
        mA.set(cnt, mN - cnt);
      }
    }
    return Z.valueOf(mA.get(mM));
  }
}

