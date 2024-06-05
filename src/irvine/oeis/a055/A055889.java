package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008284;

/**
 * A055889 CIK transform of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A055889 extends Sequence1 {

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(RING_Y);
  private final Sequence mSeq;
  private final Polynomial<Polynomial<Q>> mA = RING.empty();
  private Polynomial<Polynomial<Q>> mGf = null;
  {
    mA.add(RING_Y.zero());
  }
  private int mN = -1;
  private int mM = 0;

  protected A055889(final Sequence under) {
    mSeq = under;
  }

  /** Construct the sequence. */
  public A055889() {
    this(new A008284());
    next();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      // Update 2-d polynomial of underlying triangle
      final Polynomial<Q> row = RING_Y.empty();
      row.add(Q.ZERO);
      for (int k = 0; k <= mN; ++k) {
        row.add(new Q(mSeq.next().negate()));
      }
      mA.add(row);
      // CIK transform
      mGf = RING.zero();
      for (int s = 1; s <= mN; ++s) {
        final Polynomial<Polynomial<Q>> subs = PolynomialUtils.innerSubstitute(RING, mA.substitutePower(s, mN), s, mN);
        mGf = RING.add(mGf, RING.multiply(RING.log1p(subs, mN), RING_Y.monomial(new Q(Functions.PHI.l(s), s), 0)));
      }
      //System.out.println("a:" + mA);
      //System.out.println("g:" + mGf);
    }
    return mGf.coeff(mN).coeff(mM).toZ().negate();
  }
}
