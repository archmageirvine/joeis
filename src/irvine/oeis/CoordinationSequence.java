package irvine.oeis;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Coordination sequence for a zeolite defined by a generating function.
 * See the paper "Algebraic Description of Coordination Sequences and
 * Exact Topological Densities for Zeolites".
 * @author Sean A. Irvine
 */
public class CoordinationSequence implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mNum;
  private final Polynomial<Z> mDen;
  private int mN = -1;

  /**
   * Construct a new zeolite coordination sequence from the specification of its
   * generating function.
   * @param it the numerator (initial terms)
   * @param pl the denominator (period lengths)
   */
  public CoordinationSequence(final long[] it, final int[] pl) {
    mNum = Polynomial.create(it);
    Polynomial<Z> den = RING.one();
    for (final int length : pl) {
      den = RING.multiply(den, RING.oneMinusXToTheN(length));
    }
    mDen = den;
  }

  @Override
  public Z next() {
    return RING.coeff(mNum, mDen, ++mN);
  }
}

