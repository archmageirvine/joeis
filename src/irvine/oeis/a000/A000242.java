package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000242.
 * @author Sean A. Irvine
 */
public class A000242 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = 0;
  private Polynomial<Z> mP = RING.zero();
  private final A000081 mSeq = new A000081();
  {
    mSeq.next();
  }

  @Override
  public Z next() {
    do {
      ++mN;
      mP = RING.add(mP, RING.monomial(mSeq.next(), mN));
    } while (mN < 3);
    return RING.pow(mP, 3, mN).coeff(mN);
  }
}

