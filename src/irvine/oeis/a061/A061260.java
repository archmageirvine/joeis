package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061260 G.f.: Product_{k&gt;=1} (1-y*x^k)^(-numbpart(k)), where numbpart(k) = number of partitions of k, cf. A000041.
 * @author Sean A. Irvine
 */
public class A061260 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int p) {
      if (p > n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1 || p < 1) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(0, Math.min(n / i, p),
        j -> mB.get(n - i * j, i - 1, p - j).multiply(Binomial.binomial(Functions.PARTITIONS.z(i).add(j - 1), Z.valueOf(j)))
      );
    }
  };

  private Z t(final int n, final int m) {
    return mB.get(n, n, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
