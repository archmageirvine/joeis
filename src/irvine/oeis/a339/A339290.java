package irvine.oeis.a339;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransform;

/**
 * A339290 Number of oriented series-parallel networks with n elements and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339290 extends Sequence1 {
  // After Andrew Howroyd.
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final boolean mSingleUnit;
  private final int mColors;
  private Polynomial<Q> mNetworks = RING.zero();
  private Z mSeriesCount;
  private Z mPrevious = Z.ONE;
  private int mN = 0;

  protected A339290(final boolean singleUnit) {
    this(singleUnit, 1);
  }

  protected A339290(final boolean singleUnit, final int colors) {
    mSingleUnit = singleUnit;
    mColors = colors;
  }

  /** Construct the sequence. */
  public A339290() {
    this(true);
  }

  private final EulerTransform mParallel = new EulerTransform(1) {
    @Override
    protected Z advance() {
      return mSeriesCount;
    }
  };

  @Override
  public Z next() {
    ++mN;
    // Nontrivial series compositions have generating function B^2/(1+B).
    mSeriesCount = RING.coeff(RING.multiply(mNetworks, mNetworks, mN), RING.add(RING.one(), mNetworks), mN).toZ();
    final Z parallel = mParallel.next();
    final Z count = parallel.add(mSingleUnit ? mPrevious.multiply(mColors) : mN == 1 ? Z.valueOf(mColors) : Z.ZERO);
    mPrevious = parallel;
    mNetworks = RING.add(mNetworks, RING.monomial(new Q(count), mN));
    return count;
  }
}
