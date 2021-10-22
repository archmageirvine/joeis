package irvine.oeis.a052;

import irvine.math.IntegerUtils;

/**
 * A052113 Number of self-complementary directed 2-multigraphs with loops on n nodes.
 * @author Sean A. Irvine
 */
public class A052113 extends A052111 {

  @Override
  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        if (((v[i] * v[j]) & 1) == 0) {
          sum += IntegerUtils.gcd(v[i], v[j]);
        }
      }
    }
    sum *= 2;
    for (final int j : v) {
      if ((j & 1) == 0) {
        sum += j;
      }
    }
    return sum;
  }
}
