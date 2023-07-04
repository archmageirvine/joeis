package irvine.oeis.a009;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.z.Z;

/**
 * A009692 Number of partitions of {1, 2, ..., 2n} into pairs whose differences are primes.
 * @author Sean A. Irvine
 */
public class A009692 extends MemoryFunctionSequence<TreeSet<Integer>, Z> {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();

  @Override
  protected Z compute(final TreeSet<Integer> set) {
    if (set.isEmpty()) {
      return Z.ONE;
    }
    final int j = set.last();
    Z sum = Z.ZERO;
    for (final int i : set) {
      if (i != j && mPrime.isPrime(j - i)) {
        final TreeSet<Integer> t = new TreeSet<>(set);
        t.remove(j);
        t.remove(i);
        sum = sum.add(get(t));
      }
    }
    return sum;
  }

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final TreeSet<Integer> set = new TreeSet<>();
    for (int k = 1; k <= mN; ++k) {
      set.add(k);
    }
    return get(set);
  }

}
