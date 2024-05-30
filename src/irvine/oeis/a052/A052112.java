package irvine.oeis.a052;

import irvine.math.function.Functions;

/**
 * A052112 Number of self-complementary directed 2-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A052112 extends A052111 {

  @Override
  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        if (((v[i] * v[j]) & 1) == 0) {
          sum += Functions.GCD.i(v[i], v[j]);
        }
      }
    }
    sum *= 2;
    for (final int j : v) {
      if ((j & 1) == 0) {
        sum += j - 1;
      }
    }
    return sum;
  }
}
