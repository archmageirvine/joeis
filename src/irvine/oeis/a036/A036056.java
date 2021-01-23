package irvine.oeis.a036;

import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A036056 Sum of the lengths of the cycle types of the permutation created by length sorting on the partitions of n.
 * @author Sean A. Irvine
 */
public class A036056 extends A036052 {

  {
    super.next();
  }

  @Override
  protected Z count(final List<Integer> v) {
    final TreeSet<Integer> set = new TreeSet<>();
    final boolean[] t = new boolean[v.size()];
    for (int k = 0; k < v.size(); ++k) {
      int c = 0;
      int j = k;
      while (!t[j]) {
        t[j] = true;
        j = v.get(j) - 1;
        ++c;
      }
      if (c > 0) {
        set.add(c);
      }
    }
    Z sum = Z.ZERO;
    for (final int s : set) {
      sum = sum.add(s);
    }
    return sum;
  }
}
