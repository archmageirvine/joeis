package irvine.oeis.a036;

import java.util.List;

import irvine.math.z.Z;

/**
 * A036047 Product of order of cycles of the permutation created by duality and reversal on the partitions of n.
 * @author Sean A. Irvine
 */
public class A036047 extends A036046 {

  {
    super.next();
  }

  @Override
  protected Z count(final List<Integer> v) {
    Z res = Z.ONE;
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
        res = res.multiply(c);
      }
    }
    return res;
  }
}
