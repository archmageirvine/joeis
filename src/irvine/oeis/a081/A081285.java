package irvine.oeis.a081;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081285 Table of coefficients of polynomials f_n(q) defined by 1/Product_{i&gt;=1} (1-a q^i)^i = Sum_{n&gt;=0} a^n q^n f_n(q) / ((q)_n)^2, where (x)_n is the q-Pochhammer symbol, defined to be Product_{i=0..n-1} (1-x q^i).
 * @author Sean A. Irvine
 */
public class A081285 extends Sequence0 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = -1;
  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int u, final int o) {
      if (u + o == 0) {
        return RING.one();
      }
      final int t = Functions.TRIANGULAR.i(u + o) - Functions.TRIANGULAR.i(u + o - 1);
      return RING.add(
        RING.sum(1, u, j -> get(u - j, o + j - 1).shift(t - u)),
        RING.sum(1, o, j -> get(u + j - 1, o - j).shift(t + o))
      );
    }
  };

  @Override
  public Z next() {
    if (++mM > mB.get(mN, 0).degree()) {
      ++mN;
      final Polynomial<Z> b = mB.get(mN, 0);
      mM = 0;
      while (mM < b.degree() && b.coeff(mM).isZero()) {
        ++mM;
      }
    }
    return mB.get(mN, 0).coeff(mM);
  }
}

