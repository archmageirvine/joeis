package irvine.oeis.a059;

import irvine.math.MemoryFunction1;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A059679 Triangle T(n,k) giving number of fixed 3 X k polyominoes with n cells (n &gt;= 3, 1&lt;=k&lt;=n-2).
 * @author Sean A. Irvine
 */
public class A059679 extends Sequence3 {

  private static final int ANIMALS = 6; // Actually reduced set of values in this case
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final MatrixRing<Polynomial<Z>> MAT_RING = new MatrixRing<>(ANIMALS, RING);
  private static final Matrix<Polynomial<Z>> PSI = new DefaultMatrix<>(ANIMALS, ANIMALS, RING.zero());
  private static final Matrix<Polynomial<Z>> S = new DefaultMatrix<>(ANIMALS, 1, RING.zero());
  private static final Matrix<Polynomial<Z>> P = new DefaultMatrix<>(1, ANIMALS, RING.zero());
  static {
    final Polynomial<Z> xt = Polynomial.create(0, 2);
    final Polynomial<Z> x2 = Polynomial.create(0, 0, 1);
    final Polynomial<Z> x2t = Polynomial.create(0, 0, 2);
    final Polynomial<Z> x3 = Polynomial.create(0, 0, 0, 1);
    final Polynomial<Z> x3t = Polynomial.create(0, 0, 0, 2);
    PSI.set(0, 0, RING.x());
    PSI.set(0, 2, RING.x());
    PSI.set(0, 3, RING.x());
    PSI.set(0, 5, RING.x());
    PSI.set(1, 1, RING.x());
    PSI.set(1, 2, xt);
    PSI.set(1, 5, RING.x());
    PSI.set(2, 0, x2);
    PSI.set(2, 1, x2);
    PSI.set(2, 2, x2t);
    PSI.set(2, 3, x2);
    PSI.set(2, 5, x2);
    PSI.set(3, 3, x2);
    PSI.set(3, 5, x2);
    PSI.set(4, 0, x2t);
    PSI.set(4, 2, x2t);
    PSI.set(4, 4, x2); // Paper has an error and indicates x for this element
    PSI.set(5, 0, x3t);
    PSI.set(5, 1, x3);
    PSI.set(5, 2, x3t);
    PSI.set(5, 3, x3);
    PSI.set(5, 4, x3);
    PSI.set(5, 5, x3);
    S.set(0, 0, RING.x());
    S.set(1, 0, RING.x());
    S.set(2, 0, x2);
    S.set(4, 0, x2);
    S.set(5, 0, x3);
    P.set(0, 0, Polynomial.create(2));
    P.set(0, 1, RING.one());
    P.set(0, 2, Polynomial.create(2));
    P.set(0, 3, RING.one());
    P.set(0, 5, RING.one());
  }

  private int mN = 2;
  private int mM = 1;
  private final A059678 mB = new A059678();
  private final MemoryFunction1<Polynomial<Z>> mCStar = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      final Matrix<Polynomial<Z>> p = MAT_RING.multiply(MAT_RING.multiply(P, MAT_RING.pow(PSI, Math.max(0, n - 1))), S);
      //System.out.println("Poly: " + n + " : " + p.get(0, 0));
      return p.get(0, 0);
    }
  };

  Z c(final int n, final int m) {
    return mCStar.get(m).coeff(n).subtract(mB.b(n, m).multiply2()).subtract(n == m ? 3 : 0);
  }

  @Override
  public Z next() {
    if (++mM + 1 >= mN) {
      ++mN;
      mM = 1;
    }
    return c(mN, mM);
  }
}
