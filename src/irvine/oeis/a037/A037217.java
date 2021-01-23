package irvine.oeis.a037;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037217 Expansion of (sum(n*q^(n^2), n=0..inf))^8.
 * @author Sean A. Irvine
 */
public class A037217 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.zero();
  private Polynomial<Z> mGf = RING.zero();
  private int mN = -1;
  private int mM = 1;
  private int mS = 1;

  @Override
  public Z next() {
    if (++mN == mS) {
      mA = RING.add(mA, RING.monomial(Z.valueOf(mM), mS));
      mS = ++mM * mM;
      mGf = RING.pow(mA, 8, mS);
    }
    return mGf.coeff(mN);
  }
}
