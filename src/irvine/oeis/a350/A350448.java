package irvine.oeis.a350;

import irvine.math.MemoryFunctionInt2;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003087;

/**
 * A350448 Triangle read by rows: T(n,k) is the number of acyclic graphs on n unlabeled nodes whose longest directed path has k arcs.
 * @author Gregory Morse
 */
public class A350448 extends A003087 {
  private int mN = -1;
  private int mK = -1;
  private final MemoryFunctionInt2<CycleIndex> mPaths = new MemoryFunctionInt2<>() {
    @Override
    protected CycleIndex compute(final int n, final int k) {
      if (n == 0 && k == -1) {
        return new CycleIndex("Z(H_0)", new MultivariateMonomial());
      }
      final CycleIndex res = new CycleIndex("Z(H_{" + n + "," + k + "})");
      if (k == 0 && n > 0) {
        res.add(prependSources(n, get(0, -1)));
      } else if (k > 0) {
        // Removing the source layer shortens a longest path by one arc.
        for (int s = 1; s <= n - k; ++s) {
          res.add(prependSources(s, get(n - s, k - 1)));
        }
      }
      return res;
    }
  };

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return mN == 0 ? Z.ONE : mK == mN ? Z.ZERO : mPaths.get(mN, mK).eval(1).toZ();
  }
}
