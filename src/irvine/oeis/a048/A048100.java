package irvine.oeis.a048;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a010.A010839;
import irvine.oeis.a013.A013974;

/**
 * A048100 Fourier coefficients of T_{16}.
 * @author Sean A. Irvine
 */
public class A048100 extends A013974 {

  /** Construct the sequence. */
  public A048100() {
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
    mG.add(super.next());
    return RING.coeff(mG, mD2, ++mN);
  }
}
