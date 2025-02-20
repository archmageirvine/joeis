package irvine.oeis.a075;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075525 Triangle T(n,k) defined by Sum_{k=1..n} T(n,k)*u^k*t^n/n! = ((1+t)*(1+t^2)*(1+t^3)...)^u.
 * @author Sean A. Irvine
 */
public class A075525 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunction1<Z> mA = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return n < 1 ? Z.TWO : Functions.FACTORIAL.z(n - 1).multiply(Integers.SINGLETON.sumdiv(n, d -> Z.NEG_ONE.pow(d).multiply(n).divide(d)).negate());
    }
  };
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Z.ZERO.pow(n);
      }
      return Integers.SINGLETON.sum(0, n - m + 1, k -> Binomial.binomial(n - 1, k - 1).multiply(mA.get(k)).multiply(get(n - k, m - 1)));
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

