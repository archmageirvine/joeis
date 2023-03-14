package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A061864 Odd numbers that are the sum of two numbers with the same digits.
 * @author Sean A. Irvine
 */
public class A061864 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeMap<Z, Integer> mSeeds = new TreeMap<>();

  {
    for (int k = 1; k < 10; ++k) {
      mSeeds.put(Z.valueOf(k), k);
      mSeeds.put(Z.valueOf(10 * k), k);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mSeeds.firstKey().multiply2().compareTo(mA.first()) <= 0) {
      final Map.Entry<Z, Integer> e = mSeeds.pollFirstEntry();
      final Z seed = e.getKey();
      // Generate all numbers arising from permutation of the seed
      final Permutation perm = Permutation.permuter(seed);
      final ArrayList<Z> nums = new ArrayList<>();
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          nums.add(Permutation.permToZ(p));
        }
      }
      // Form all possible sums
      for (int k = 0; k < nums.size(); ++k) {
        for (int j = 0; j < k; ++j) {
          final Z t = nums.get(k).add(nums.get(j));
          if (t.isOdd()) {
            mA.add(t);
          }
        }
      }
      final Z s = seed.multiply(10);
      if (seed.mod(10) == 0) {
        // Deal with numbers like 100..., 200...
        mSeeds.put(s, e.getValue());
      }
      for (int k = e.getValue(); k < 10; ++k) {
        mSeeds.put(s.add(k), k);
      }
    }
    return mA.pollFirst();
  }
}
