package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000349 One-half the number of permutations of length n with exactly 2 rising or falling successions.
 * @author Sean A. Irvine
 */
public class A000349 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> T1 = Polynomial.create(1, -1);
  private static final Polynomial<Z> T2 = RING.multiply(T1, T1, 2);
  private static final Polynomial<Z> T3 = RING.multiply(T2, T1, 2);

  private long mN = -1;

  private Polynomial<Z> mS0 = null;
  private Polynomial<Z> mS1 = null;
  private Polynomial<Z> mS2 = null;
  private Polynomial<Z> mS3 = null;

  @Override
  public Z next() {
    ++mN;
    if (mS3 == null) {
      if (mS0 == null) {
        mS0 = RING.one();
        return Z.ZERO;
      }
      if (mS1 == null) {
        mS1 = RING.one();
        return Z.ZERO;
      }
      if (mS2 == null) {
        mS2 = Polynomial.create(0, 2);
        return Z.ZERO;
      }
      mS3 = Polynomial.create(0, 4, 2);
      return Z.ONE;
    }
    final Polynomial<Z> t = RING.add(RING.subtract(RING.subtract(RING.multiply(mS3, Polynomial.create(mN + 1, -1), 2),
      RING.multiply(RING.multiply(mS2, T1, 2), Polynomial.create(mN - 2, 3), 2)),
      RING.multiply(RING.multiply(mS1, T2, 2), Polynomial.create(mN - 5, 1), 2)),
      RING.multiply(RING.multiply(mS0, T3, 2), Z.valueOf(mN - 3)));
    mS0 = mS1;
    mS1 = mS2;
    mS2 = mS3;
    mS3 = t;
    return t.coeff(2).divide2();
  }
}
