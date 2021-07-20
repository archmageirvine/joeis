package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000270 For n &gt;= 2, a(n) = b(n+1)+b(n)+b(n-1), where the b(i) are the m\u00e9nage numbers A000179; a(0)=a(1)=1.
 * @author Sean A. Irvine
 */
public class A000270 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 2, 1);

  private final MemoryFactorial mF = new MemoryFactorial();
  private Polynomial<Z> mOuter = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if ((mN & 1) == 0) {
      mOuter = RING.add(mOuter, RING.monomial(Z.TWO, mN));
    } else {
      mOuter = RING.subtract(mOuter, RING.monomial(Z.TWO, mN));
    }
    Polynomial<Z> p = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      p = RING.add(p, RING.multiply(RING.pow(RING.series(RING.x(), DEN, mN), k, mN), mF.factorial(k).multiply(k)));
    }
    return RING.multiply(mOuter, p, mN).coeff(mN);
  }

}

