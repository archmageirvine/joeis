package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001267 One-half the number of permutations of length n with exactly 3 rising or falling successions.
 * @author Sean A. Irvine
 */
public class A001267 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private long mN = -1;
  private Polynomial<Z> mA = RING.one();
  private Polynomial<Z> mB = RING.one();
  private Polynomial<Z> mC = Polynomial.create(0, 2);
  private Polynomial<Z> mD = Polynomial.create(0, 4, 2);

  protected int coeff() {
    return 3;
  }

  private Polynomial<Z> s(final long n) {
    if (n <= 1) {
      return RING.one();
    }
    if (n == 2) {
      return mC;
    }
    if (n == 3) {
      return mD;
    }
    final int c = coeff();
    final Polynomial<Z> t = RING.add(RING.subtract(RING.subtract(RING.multiply(mD, Polynomial.create(n + 1, -1), c),
      RING.multiply(mC, Polynomial.create(n - 2, 5 - n, -3), c)),
      RING.multiply(mB, Polynomial.create(n - 5, 11 - 2 * n, n - 7, 1), c)),
      RING.multiply(mA, Polynomial.create(n - 3, 9 - 3 * n, 3 * n - 9, 3 - n), c));
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }

  @Override
  public Z next() {
    return s(++mN).coeff(coeff()).divide(2);
  }
}
