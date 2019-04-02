package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000144 Number of ways of writing n as a sum of 10 squares.
 * @author Sean A. Irvine
 */
public class A000144 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  private int mLastBase = 0;
  private Polynomial<Z> mA = RING.one();
  private Polynomial<Z> mPoweredA = mA;
  private final int mPower;

  A000144(final int power) {
    mPower = power;
  }

  /** Construct this sequence. */
  public A000144() {
    this(10);
  }

  @Override
  public Z next() {
    if (++mN < 0) {
      throw new UnsupportedOperationException();
    }
    if (mN > mPoweredA.degree()) {
      ++mLastBase;
      mA = RING.add(mA, RING.monomial(Z.TWO, mLastBase * mLastBase));
      final int t = mLastBase + 1;
      mPoweredA = RING.pow(mA, mPower, t * t - 1);
    }
    return mPoweredA.coeff(mN);
  }
}

