package irvine.oeis.a038;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038078 Number of identity trees with 2-colored nodes.
 * @author Sean A. Irvine
 */
public class A038078 extends AbstractSequence {

  private final A038077 mSeq1 = new A038077();

  /** Construct the sequence. */
  public A038078() {
    super(0);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Z.ZERO);
      return Z.ONE;
    }
    mB.add(mSeq1.next());
    return mB.coeff(mN).subtract(mB.substitutePower(2, mN).coeff(mN).add(RING.multiply(mB, mB, mN).coeff(mN)).divide2());
  }
}
