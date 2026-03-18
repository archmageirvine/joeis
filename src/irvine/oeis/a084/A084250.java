package irvine.oeis.a084;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084250 Let a(1) = 1; for n&gt;1, let a(n) be smallest positive integer distinct from all earlier terms such that exp(sum(n&gt;=1,a(n)*x^n/n)) has integer coefficients (cf. A084251).
 * @author Sean A. Irvine
 */
public class A084250 extends AbstractSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mP = RING.empty();
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private int mN;

  protected A084250(final int offset) {
    super(offset);
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A084250() {
    this(1);
  }

  protected Z select(final Z a, final Z b) {
    return a;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE; // To support A04251
    }
    if (mN == 1) {
      mP.add(Q.ZERO);
      mP.add(Q.ONE);
      return select(Z.ONE, Z.ONE);
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    mP.add(Q.ZERO);
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        mP.set(mN, new Q(k, mN));
        final Polynomial<Q> exp = RING.exp(mP, mN);
        if (exp.coeff(mN).isInteger()) {
          //System.out.println(exp);
          mUsed.set(k);
          return select(Z.valueOf(k), exp.coeff(mN).toZ());
        }
      }
      ++k;
    }
  }
}
