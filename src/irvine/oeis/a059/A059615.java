package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059615 a(n) is the number of non-parallel lines determined by a pair of vertices (extreme points) in the polytope of real n X n doubly stochastic matrices. The vertices are the n! permutation matrices.
 * @author Sean A. Irvine
 */
public class A059615 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final Z fn = Functions.FACTORIAL.z(n);
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN - 2; ++k) {
      Z s = Z.ZERO;
      for (int j = 0; j <= mN - k; ++j) {
        s = s.signedAdd((j & 1) == 0, fn.divide(Functions.FACTORIAL.z(j)));
      }
      sum = sum.add(s.multiply(fn).divide(Functions.FACTORIAL.z(k).square()));
    }
    return sum.divide2();
  }
}
