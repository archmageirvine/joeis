package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051026 Number of primitive subsequences of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A051026 extends MemorySequence {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();

  private final MemoryFunction<TreeSet<Integer>, Long> mS = new MemoryFunction<>() {
    @Override
    protected Long compute(final TreeSet<Integer> set) {
      if (set.isEmpty()) {
        return 1L;
      }
      final Integer m = set.last();
      final TreeSet<Integer> s1 = new TreeSet<>(set);
      s1.remove(m);
      final long res = getValue(s1);
      final TreeSet<Integer> s2 = new TreeSet<>(set); // copy safety for caching
      for (final Z d : Jaguar.factor(m).divisors()) {
        s2.remove(d.intValueExact());
      }
      return res + getValue(s2);
    }
  };

  private long bb(final int n) {
    final TreeSet<Integer> set = new TreeSet<>();
    for (int k = 2; k < n; ++k) {
      if (n % k != 0) {
        set.add(k);
      }
    }
    return mS.getValue(set);
  }

  private final MemoryFunction1<Long> mSB = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return n < 2 ? 0L : bb(n) + get(n - 1);
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return mPrime.isPrime(n) ? a(n - 1).multiply2().subtract(1) : Z.TWO.add(mSB.get(n));
  }
}
