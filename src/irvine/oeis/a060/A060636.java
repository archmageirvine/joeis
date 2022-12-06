package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.util.CollectionUtils;

/**
 * A060636 A060448 sorted and duplicates removed.
 * @author Sean A. Irvine
 */
public class A060636 extends A060448 {

  // After Charlie Neder

  private int mN = 1;
  private final TreeSet<Z> mA = new TreeSet<>();

  // Generates prime signatures of divisors, given prime signature
  private List<List<Integer>> facs(final List<Integer> arr) {
    final List<List<Integer>> powers = new ArrayList<>();
    for (final int i : arr) {
      final ArrayList<Integer> l = new ArrayList<>();
      for (int j = 0; j <= i; ++j) {
        l.add(j);
      }
      powers.add(l);
    }
    final List<List<Integer>> res = CollectionUtils.cartesianProduct(powers);
    res.remove(0);
    return res;
  }

  // Returns multiplicative partitions
  private List<List<Integer>> multipart(final int n, final int mx) {
    if (n == 1) {
      return Collections.singletonList(Collections.emptyList());
    }
    final ArrayList<List<Integer>> res = new ArrayList<>();
    for (int k = 2; k <= Math.min(mx, n); ++k) {
      if (n % k == 0) {
        for (final List<Integer> j : multipart(n / k, k)) {
          final ArrayList<Integer> t = new ArrayList<>();
          t.add(k - 1);
          t.addAll(j);
          res.add(t);
        }
      }
    }
    return res;
  }


  private int getOrZero(final List<Integer> lst, final int pos) {
    return pos >= lst.size() ? 0 : lst.get(pos);
  }

  // Traverses the possibility tree
  private long split(final List<List<Integer>> arr, final List<Integer> mults, final int pos) {
    if (pos >= arr.size()) {
      for (final int x : mults) {
        if (x < 0) {
          return 0;
        }
      }
      return 1;
    }
    final ArrayList<Integer> plus = new ArrayList<>();
    final ArrayList<Integer> minus = new ArrayList<>();
    for (int k = 0; k < Math.max(mults.size(), arr.get(pos).size()); ++k) {
      plus.add(getOrZero(mults, k) + getOrZero(arr.get(pos), k));
      minus.add(getOrZero(mults, k) - getOrZero(arr.get(pos), k));
    }
    return split(arr, plus, pos + 1) + split(arr, minus, pos + 1);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (final List<Integer> num : multipart(mN, mN)) {
        mA.add(Z.valueOf(split(facs(num), Collections.emptyList(), 0)));
      }
    }
    return mA.pollFirst();
  }
}
