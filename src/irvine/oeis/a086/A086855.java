package irvine.oeis.a086;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086855 Number of permutations of length n with exactly 4 rising or falling successions.
 * @author Sean A. Irvine
 */
public class A086855 extends Sequence0 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, -1);
  private static final Polynomial<Z> X2 = RING.pow(X1, 2);
  private static final Polynomial<Z> X3 = RING.multiply(X2, X1, 4);
  private int mN = -1;
  private final MemoryFunction1<Polynomial<Z>> mS = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n < 4) {
        if (n < 2) {
          return RING.one();
        }
        return n == 2 ? Polynomial.create(0, 2) : Polynomial.create(0, 4, 2);
      }
      final Polynomial<Z> t0 = RING.multiply(get(n - 1), Polynomial.create(n + 1, -1), 4);
      final Polynomial<Z> t1 = RING.multiply(RING.multiply(get(n - 2), Polynomial.create(n - 2, 3), 4), X1, 4);
      final Polynomial<Z> t2 = RING.multiply(RING.multiply(get(n - 3), Polynomial.create(n - 5, 1), 4), X2, 4);
      final Polynomial<Z> t3 = RING.multiply(RING.multiply(get(n - 4), Z.valueOf(n - 3)), X3, 4);
      return RING.add(RING.subtract(RING.subtract(t0, t1), t2), t3);
    }
  };

  @Override
  public Z next() {
    return mS.get(++mN).coeff(4);
  }
}

