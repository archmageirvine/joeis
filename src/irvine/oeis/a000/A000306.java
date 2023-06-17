package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001383;

/**
 * A000306 Number of trees of diameter 8.
 * @author Sean A. Irvine
 */
public class A000306 extends AbstractSequence {

  /** Construct the sequence. */
  public A000306() {
    super(9);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final A000235 mR3 = new A000235();
  private final A000299 mR4 = new A000299();
  private final A001383 mS3 = new A001383();
  private Polynomial<Z> mPR3 = RING.zero();
  private Polynomial<Z> mPR4 = RING.zero();
  private Polynomial<Z> mPS3 = Polynomial.create(0, -1);
  private int mN = 0;

  @Override
  public Z next() {
    do {
      final int p = Math.max(1, mN);
      mPR3 = RING.add(mPR3, RING.monomial(mR3.next(), p));
      mPR4 = RING.add(mPR4, RING.monomial(mR4.next(), p));
      mPS3 = RING.add(mPS3, RING.monomial(mS3.next(), p));
    } while (++mN < 9);
    return RING.subtract(mPR4, RING.multiply(mPR3, mPS3, mN)).coeff(mN - 1);
  }
}
