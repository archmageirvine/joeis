package irvine.oeis;

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
  private int mN = -1;

  /**
   * Creates a new reversible, indistinct, unlabeled transform.
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public BikTransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  /**
   * Compute the BIK transform of a polynomial.
   * @param seq sequence
   * @return BIK transform
   */
  public static Polynomial<Z> bik(final Polynomial<Z> seq) {
    final int mN = seq.degree();
    final Polynomial<Z> aa = seq.substitutePower(2, mN);
    final Polynomial<Z> b1 = RING.series(RING.subtract(TWO, RING.pow(seq, 2, mN)), RING.subtract(RING.one(), seq), mN);
    final Polynomial<Z> b2 = RING.series(RING.multiply(aa, RING.add(RING.one(), seq)), RING.subtract(RING.one(), aa), mN);
    return RING.divide(RING.add(b1, b2), Z.TWO);
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
    return bik(mA).coeff(mN);
  }
}
