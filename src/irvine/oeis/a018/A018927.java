package irvine.oeis.a018;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018927 For each permutation p of <code>{1,2,...,n}</code> define maxjump(p) = max(p(i) - i); <code>a(n)</code> is sum of maxjumps of all p.
 * @author Sean A. Irvine
 */
public class A018927 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
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

