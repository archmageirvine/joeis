package irvine.oeis.a048;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a010.A010839;
import irvine.oeis.a058.A058550;

/**
 * A048057 Fourier coefficients of T_{12}.
 * @author Sean A. Irvine
 */
public class A048057 extends AbstractSequence {

  private final Sequence mA = new A058550();

  /** Construct the sequence. */
  public A048057() {
    super(-2);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private final Sequence mDelta2 = new A010839();
  private final Polynomial<Z> mG = RING.empty();
  private final Polynomial<Z> mD2 = RING.empty();

  @Override
  public Z next() {
    mD2.add(mDelta2.next());
    mG.add(mA.next());
    return RING.coeff(mG, mD2, ++mN);
  }
}
