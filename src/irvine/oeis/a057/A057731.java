package irvine.oeis.a057;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057731 Irregular triangle read by rows: T(n,k) = number of elements of order k in symmetric group S_n, for n &gt;= 1, 1 &lt;= k &lt;= g(n), where g(n) = A000793(n) is Landau's function.
 * @author Sean A. Irvine
 */
public class A057731 extends MemoryFunctionInt2<Polynomial<Z>> implements Sequence {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mP = RING.zero();
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n, final int g) {
    if (n == 0) {
      return RING.monomial(Z.ONE, g);
    }
    return RING.sum(1, n, j -> RING.multiply(
      get(n - j, IntegerUtils.lcm(g, j)),
      Binomial.binomial(n - 1, j - 1).multiply(MemoryFactorial.SINGLETON.factorial(j - 1))
    ));
  }

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      mP = get(++mN, 1);
      mM = 1;
    }
    return mP.coeff(mM);
  }

}
