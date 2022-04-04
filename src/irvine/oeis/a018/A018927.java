package irvine.oeis.a018;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018927 For each permutation p of {1,2,...,n} define maxjump(p) = max(p(i) - i); a(n) is sum of maxjumps of all p.
 * @author Sean A. Irvine
 */
public class A018927 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(mF.factorial(k).multiply(k).multiply(Z.valueOf(k + 1).pow(mN - k).subtract(Z.valueOf(k).pow(mN - k))));
    }
    return sum;
  }
}

