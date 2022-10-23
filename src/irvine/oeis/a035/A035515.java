package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A035515 Zeckendorf expansion of n: repeatedly subtract the largest Fibonacci number you can until nothing remains.
 * @author Sean A. Irvine
 */
public class A035515 extends Sequence0 {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    int k = 1;
    while (mFibo.a(k).compareTo(mN) <= 0) {
      ++k;
    }
    Z m = mN;
    while (!m.isZero()) {
      final Z f = mFibo.a(k);
      if (f.compareTo(m) > 0) {
        --k;
      } else {
        sb.insert(0, f);
        m = m.subtract(f);
      }
    }
    return new Z(sb);
  }
}

