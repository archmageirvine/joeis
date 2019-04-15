package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001100 Triangle read by rows: <code>T(n,k) =</code> number of permutations of length n with exactly k rising or falling successions, for <code>n &gt;= 1, 0 &lt;= k &lt;= n-1</code>.
 * @author Sean A. Irvine
 */
public class A001100 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private Polynomial<Z> mB = null;
  private Polynomial<Z> mC = null;
  private Polynomial<Z> mD = null;
  private int mDeg = -2;
  private long mN = 3;

  @Override
  public Z next() {
    if (mB == null) {
      mB = RING.one();
      return Z.ONE;
    }
    if (mC == null) {
      mC = Polynomial.create(0, 2);
      return Z.ZERO;
    }
    if (++mDeg == -1) {
      return Z.TWO;
    }
    if (mD == null) {
      mD = Polynomial.create(0, 4, 2);
    }
    if (mDeg > mD.degree()) {
      mDeg = 0;
      ++mN;
      final Polynomial<Z> t = RING.add(RING.subtract(RING.subtract(RING.multiply(mD, Polynomial.create(mN + 1, -1)),
        RING.multiply(mC, Polynomial.create(mN - 2, 5 - mN, -3))),
        RING.multiply(mB, Polynomial.create(mN - 5, 11 - 2 * mN, mN - 7, 1))),
        RING.multiply(mA, Polynomial.create(mN - 3, 9 - 3 * mN, 3 * mN - 9, 3 - mN)));
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD.coeff(mDeg);
  }
}

