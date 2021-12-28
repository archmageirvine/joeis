package irvine.oeis.a053;

import irvine.math.IntegerUtils;

/**
 * A053514 Number of 3-multigraphs with loops on n nodes.
 * @author Sean A. Irvine
 */
public class A053514 extends A053468 {

  // After Andrew Howroyd

  @Override
  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        sum += IntegerUtils.gcd(v[i], v[j]);
      }
    }
    for (final int j : v) {
      sum += j / 2 + 1;
    }
    return sum;
  }
}
