package irvine.oeis.a339;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003430;
import irvine.oeis.transform.EulerTransform;

/**
 * A339158 Number of essentially parallel achiral series-parallel networks with n elements.
 * @author Gregory Morse
 */
public class A339158 extends Sequence1 {
  // After Andrew Howroyd.
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Sequence mOrdered;
  private final boolean mSingleUnit;
  private final boolean mSeries;
  private final Q mColors;
  private Polynomial<Q> mPaired = RING.zero();
  private Polynomial<Q> mParallel = RING.zero();
  private Z mWeight;
  private Z mPrevious = Z.ONE;
  private int mN = 0;

  protected A339158(final boolean singleUnit, final boolean series) {
    this(singleUnit, series, 1, singleUnit ? new A339290() : new A003430().skip(1));
  }

  protected A339158(final boolean singleUnit, final boolean series, final int colors, final Sequence ordered) {
    mSingleUnit = singleUnit;
    mSeries = series;
    mColors = new Q(colors);
    mOrdered = ordered;
  }

  /** Construct the sequence. */
  public A339158() {
    this(false, false);
  }

  private final EulerTransform mMultiset = new EulerTransform(1) {
    @Override
    protected Z advance() {
      return mWeight;
    }
  };

  @Override
  public Z next() {
    ++mN;
    final boolean even = (mN & 1) == 0;
    if (even) {
      mPaired = RING.add(mPaired, RING.monomial(new Q(mOrdered.next()), mN));
    }
    final Polynomial<Q> t = RING.add(mSingleUnit ? RING.zero() : RING.monomial(mColors, 1), RING.multiply(mPaired, RING.add(RING.one(), mParallel), mN));
    final Q pairedSeries = RING.coeff(RING.multiply(mPaired, mPaired, mN), RING.add(RING.one(), mPaired), mN);
    // Reversal fixes palindromes and pairs the other series configurations.
    final Q difference = pairedSeries.add(!mSingleUnit && mN == 2 ? mColors : Q.ZERO).subtract(even ? t.coeff(mN / 2) : Q.ZERO);
    final Q series = t.coeff(mN);
    mWeight = series.add(difference.divide(2)).toZ();
    final Z multiset = mMultiset.next();
    final Q parallel = new Q(multiset.add(mSingleUnit ? mPrevious : mN == 1 ? mColors.toZ() : Z.ZERO)).subtract(series);
    mPrevious = multiset;
    mParallel = RING.add(mParallel, RING.monomial(parallel, mN));
    return (mSeries ? series : parallel).toZ();
  }
}
