package irvine.oeis.a010;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010815 From Euler's Pentagonal Theorem: coefficient of q^n in Product_{m&gt;=1} <code>(1 -</code> q^m).
 * @author Sean A. Irvine
 */
public class A010815 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mM = 1;
  private Polynomial<Z> mGf = RING.eta(RING.x(), mM);

  @Override
  public Z next() {
    if (++mN > mM) {
      mM <<= 1;
      mGf = RING.eta(RING.x(), mM);
    }
    return mGf.coeff(mN);
  }
}
