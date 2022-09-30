package irvine.oeis.a059;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059615 a(n) is the number of non-parallel lines determined by a pair of vertices (extreme points) in the polytope of real n X n doubly stochastic matrices. The vertices are the n! permutation matrices.
 * @author Sean A. Irvine
 */
public class A059615 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z fn = MemoryFactorial.SINGLETON.factorial(++mN);
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN - 2; ++k) {
      Z s = Z.ZERO;
      for (int j = 0; j <= mN - k; ++j) {
        s = s.signedAdd((j & 1) == 0, fn.divide(MemoryFactorial.SINGLETON.factorial(j)));
      }
      sum = sum.add(s.multiply(fn).divide(MemoryFactorial.SINGLETON.factorial(k).square()));
    }
    return sum.divide2();
  }
}
