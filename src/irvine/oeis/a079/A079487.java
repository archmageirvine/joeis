package irvine.oeis.a079;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079487.
 * @author Sean A. Irvine
 */
public class A079487 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = null;
  private Polynomial<Z> mB = Polynomial.create(1, 1);
  private int mN = 1;
  private int mM = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Polynomial.create(1);
      return Z.ONE;
    }
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final Polynomial<Z> t = (mN & 1) == 0 ? RING.add(mB, mA.shift(2)) : RING.add(mB.shift(1), mA);
      mA = mB;
      mB = t;
    }
    return mB.coeff(mM);
  }
}

