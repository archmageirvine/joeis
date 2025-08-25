package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a064.A064538;

/**
 * A079618 Triangle of coefficients in polynomials for partial sums of powers, scaled to produce integers: Sum_{i=1..m} i^(n-1) = Sum_{k=1..n} T(n,k)*m^k/A064538(n-1).
 * @author Sean A. Irvine
 */
public class A079618 extends Sequence1 {

  private final DirectSequence mSeq = DirectSequence.create(new A064538());
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1) {
        return m == 1 ? Z.ONE : Z.ZERO;
      }
      if (m == 1) {
        return mSeq.a(n - 1).subtract(Integers.SINGLETON.sum(2, n, k -> get(n, k)));
      }
      return get(n - 1, m - 1).multiply(n - 1).multiply(mSeq.a(n - 1)).divide(m).divide(mSeq.a(n - 2));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}

