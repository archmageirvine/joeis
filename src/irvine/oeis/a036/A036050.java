package irvine.oeis.a036;

import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A036050.
 * @author Sean A. Irvine
 */
public class A036050 extends A036046 {

  {
    super.next();
  }

  @Override
  protected Z order(final List<Integer> v) {
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
