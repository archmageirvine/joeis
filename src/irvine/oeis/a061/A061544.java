package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000169;

/**
 * A061544 Number of connected labeled graphs with n nodes and n+6 edges.
 * @author Sean A. Irvine
 */
public class A061544 extends A000169 {

  // E.g.f.: W6(x) = - 1/5806080*T(x)^6*( - 3669120 - 145514880*T(x) - 826813440*T(x)^2 - 160242624*T(x)^3 + 549065304*T(x)^4 - 1423242144*T(x)^5 + 1649073392*T(x)^6 - 1408032768*T(x)^7 + 881917344*T(x)^8 - 418233349*T(x)^9 + 147585749*T(x)^10 - 37755372*T(x)^11 + 6581528*T(x)^12 - 696620*T(x)^13 + 33000*T(x)^14)/(( - 1 + T(x))^18)

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mT = RING.empty();
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mT.add(Q.ZERO);
  }
  private final long mDen;
  private final int mDenPower;
  private final int mNumPower;
  private final long[] mCoeffs;

  protected A061544(final long den, final int denPower, final int numPower, final long... coeffs) {
    mDen = den;
    mDenPower = denPower;
    mNumPower = numPower;
    mCoeffs = coeffs;
  }

  /** Construct the sequence. */
  public A061544() {
    this(5806080, 18, 6, 3669120, 145514880, 826813440, 160242624, -549065304, 1423242144, -1649073392, 1408032768, -881917344, 418233349, -147585749, 37755372, -6581528, 696620, -33000);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mT.add(new Q(super.next(), mF));
    if (mN < mNumPower) {
      return Z.ZERO;
    }
    Polynomial<Q> num = RING.zero();
    Polynomial<Q> tp = RING.one();
    for (final long c : mCoeffs) {
      num = RING.add(num, RING.multiply(tp, new Q(c)));
      tp = RING.multiply(tp, mT, mN);
    }
    num = RING.multiply(num, RING.pow(mT, mNumPower, mN), mN);
    final Polynomial<Q> den = RING.pow(RING.subtract(RING.one(), mT), mDenPower, mN);
    return RING.coeff(num, den, mN).multiply(mF).toZ().divide(mDen);
  }
}
