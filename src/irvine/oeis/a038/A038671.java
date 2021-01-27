package irvine.oeis.a038;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038671 Number of nonnegative solutions of x1^2 + x2^2 + ... + x5^2 = n.
 * @author Sean A. Irvine
 */
public class A038671 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private Polynomial<Z> mA5 = RING.one();
  private int mM = 1;
  private int mS = 1;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == mS) {
      mA = RING.add(mA, RING.monomial(Z.ONE, mS));
      mS = ++mM * mM;
      mA5 = RING.pow(mA, 5, mS - 1);
    }
    return mA5.coeff(mN);
  }
}
