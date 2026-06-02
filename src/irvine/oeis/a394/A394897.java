package irvine.oeis.a394;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394897 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A394897 extends Sequence1 {

  private int mN = 0;
  private MemoryFunction1<Z> mPowers = null;

  private boolean is(final Z n, final int parts, final int prev) {
    if (parts == 0) {
      return n.isZero();
    }
    int k = prev;
    while (true) {
      final Z kp = mPowers.get(++k);
      if (kp.multiply(parts).compareTo(n) > 0) {
        return false;
      }
      if (is(n.subtract(kp), parts - 1, k)) {
        return true;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mPowers = new MemoryFunction1<>() {
      @Override
      protected Z compute(final int n) {
        return Z.valueOf(n).pow(mN);
      }
    };
    long k = 3;
    while (true) {
      if (is(Z.valueOf(++k).pow(mN), 3 * mN, 0)) {
        return Z.valueOf(k);
      }
    }
  }
}

