package irvine.oeis.a010;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010028 Triangle read by rows: <code>T(n,k) =</code> one-half the number of permutations of length n with exactly <code>n-k</code> rising or falling successions, for <code>n &gt;= 1, 1 &lt;= k &lt;= n. T(1,1) = 1</code> by convention.
 * @author Sean A. Irvine
 */
public class A010028 extends MemoryFunction1<Polynomial<Z>> implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = RING.oneMinusXToTheN(1);
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n) {
    switch (n) {
      case 0:
      case 1:
        return RING.one();
      case 2:
        return RING.monomial(Z.TWO, 1);
      case 3:
        return Polynomial.create(0, 4, 2);
      default:
        return RING.add(RING.subtract(RING.subtract(RING.multiply(get(n - 1), Polynomial.create(mN + 1, -1)),
          RING.multiply(get(n - 2), RING.multiply(Polynomial.create(mN - 2, 3), X1))),
          RING.multiply(get(n - 3), RING.multiply(Polynomial.create(mN - 5, 1), RING.pow(X1, 2)))),
          RING.multiply(get(n - 4), RING.multiply(RING.pow(X1, 3), Z.valueOf(mN - 3))));
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN).coeff(mN - mM).add(1).divide2();
  }
}
