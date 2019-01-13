package irvine.oeis;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A sequence comprising the reversible, indistinct, unlabeled transform.
 * @author Sean A. Irvine
 */
public class BikTransformSequence implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> TWO = Polynomial.create(2);
  private final Sequence mSeq;
  private Polynomial<Z> mA = RING.zero();
  private final ArrayList<Z> mOneMinusA = new ArrayList<>();
  private final ArrayList<Z> mOnePlusA = new ArrayList<>();
  private int mN = -1;

  /**
   * Creates a new reversible, indistinct, unlabeled transform.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public BikTransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mOneMinusA.add(Z.ONE);
    mOnePlusA.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z an = mSeq.next();
    if (an == null) {
      return null;
    }
    mA = RING.add(mA, RING.monomial(an, mN));
    mOnePlusA.add(an);
    mOneMinusA.add(an.negate());
    final Polynomial<Z> aa = mA.substitutePower(2, mN);
    final Polynomial<Z> b1 = RING.series(RING.subtract(TWO, RING.pow(mA, 2, mN)), RING.create(mOneMinusA), mN);
    final Polynomial<Z> b2 = RING.series(RING.multiply(aa, RING.create(mOnePlusA)), RING.subtract(RING.one(), aa), mN);
    return RING.add(b1, b2).coeff(mN).divide2();
  }
}
