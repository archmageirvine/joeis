package irvine.oeis.a120;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A120602 G.f. satisfies: 31*A(x) = 30 + 125*x + A(x)^6, starting with [1,5,15].
 * @author Georg Fischer
 */
public class A120602 extends Sequence0 {

  private int mN;
  private final int mFa;
  private final int mDiv;
  private final int mPow;
  private final Q[] mInits;
  private final int mInLen;
  private Polynomial<Q> mA;
  private final Polynomial<Q> mX;
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  /** Construct the sequence. */
  public A120602() {
    this(31, 25, 125, 6, 1, 5, 15);
  }

  /**
   * Generic constructor with parameters. The equation is <code>fa*A(x) = x0 + x1*x + A(x)^pow</code>.
   * @param fa parameter
   * @param div divisor
   * @param x1 first x
   * @param pow power
   * @param inits initial terms
   */
  public A120602(final int fa, final int div, final int x1, final int pow, final long... inits) {
    mN = -1;
    mFa = fa;
    mDiv = div;
    mPow = pow;
    mInLen = inits.length;
    mInits = new Q[mInLen];
    for (int i = 0; i < mInLen; ++i) {
      mInits[i] = new Q(inits[i]);
    }
    mA = Polynomial.create(mInits);
    mX = Polynomial.create(new Q(fa - 1), new Q(x1));
  }

  /* (PARI) {a(n)=local(A=1+x+6*x^2+x*O(x^n)); for(i=0, n, A=A-5*A+4+x+A^4); polcoeff(A, n)} */
  @Override
  public Z next() {
    ++mN;
    if (mN < mInLen) {
      return mInits[mN].num();
    }
    mA = RING.add(mA, RING.divide(RING.add(RING.add(RING.multiply(mA, new Q(-mFa)), mX), RING.pow(mA, mPow, mN)), new Q(mDiv)));
    return mA.coeff(mN).num();
  }
}
