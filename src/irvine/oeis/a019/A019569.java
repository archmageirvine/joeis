package irvine.oeis.a019;

import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019569 Number of bar segments in a certain way of representing the integers graphically.
 * @author Sean A. Irvine
 */
public class A019569 extends MemorySequence {

  private final TreeMap<Long, Integer> mInversePi = new TreeMap<>();
  private final Fast mPrime = new Fast();
  private int mPi = 0;
  private long mP = 1;
  {
    add(null);
  }

  private int inversePi(final long p) {
    while (p > mP) {
      mP = mPrime.nextPrime(mP);
      mInversePi.put(mP, ++mPi);
    }
    return mInversePi.get(p);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n - 1);
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    int prevPi = 0;
    for (final Z pp : fs.toZArray()) {
      final int pi = inversePi(pp.longValueExact());
      sum = sum.add(get(fs.getExponent(pp))).add(get(pi - prevPi)).add(1);
      prevPi = pi;
    }
    return sum;
  }
}
