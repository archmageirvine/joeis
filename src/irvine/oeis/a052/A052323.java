package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A052323 Number of labeled trees with a forbidden limb of length 3.
 * @author Sean A. Irvine
 */
public class A052323 extends AbstractSequence {

  private final A052322 mSeq1 = new A052322();

  /** Construct the sequence. */
  public A052323() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Z[] SMALL = {Z.ONE, Z.ONE, Z.ONE, Z.THREE, Z.FOUR, Z.valueOf(65), Z.valueOf(576)};
  private final Polynomial<Q> mB = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Q.ZERO);
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    mB.add(new Q(mSeq1.next(), mF));
    if (mN < SMALL.length) {
      return SMALL[mN]; // avoid need for "corrections" to e.g.f.
    } else {
      final Q t = mB.get(mN).subtract(RING.pow(mB, 2, mN).coeff(mN).divide(2));
      return t.multiply(mF).toZ();
    }
  }
}
