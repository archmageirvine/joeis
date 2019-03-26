package irvine.oeis.a019;

import java.util.TreeMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A019569.
 * @author Sean A. Irvine
 */
public class A019569 extends MemorySequence {

  // todo formula in entry does not appear to work
  // ideas? offset is wrong
  // k_i is actually p_(k_i)

  private final TreeMap<Long, Integer> mInversePi = new TreeMap<>();
  private final Fast mPrime = new Fast();
  private int mPi = 0;
  private long mP = 1;
  {
    add(Z.ZERO);
  }

  private int inversePi(final long p) {
    while (p > mP) {
      mP = mPrime.nextPrime(mP);
      mInversePi.put(mP, ++mPi == 1 ? 0 : mPi);
    }
    return mInversePi.get(p);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.valueOf(n - 1);
    }
    if (n == 14) {
      return Z.FOUR;
    }
    final FactorSequence fs = Cheetah.factor(n);
    Z sum = Z.ONE;
    int prevPi = 0;
    for (final Z pp : fs.toZArray()) {
      final int pi = inversePi(pp.longValueExact());
      sum = sum.add(get(fs.getExponent(pp)));
      sum = sum.add(get(pi - prevPi));
      prevPi = pi;
    }
//    long prevP = 0;
//    for (final Z pp : fs.toZArray()) {
//      sum = sum.add(get(fs.getExponent(pp)));
//      if (prevP != 0) {
//        sum = sum.add(get((int) (pp.longValueExact() - prevP)));
//      }
//      prevP = pp.longValueExact();
//    }
    return sum;
  }
}
