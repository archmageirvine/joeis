package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006571 Expansion of <code>q*Product_{k&gt;=1} (1-q^k)^2*(1-q^(11*k))^2</code>.
 * @author Sean A. Irvine
 */
public class A006571 implements Sequence {

  private static final int CHUNK = 1000;
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mGenFun = RING.zero();

  @Override
  public Z next() {
    if (++mN >= mGenFun.degree()) {
      // Compute a lot of terms at once to avoid excessive recomputation of gf
      mGenFun = RING.pow(RING.multiply(RING.eta(RING.x(), mN + CHUNK), RING.eta(RING.monomial(Z.ONE, 11), mN + CHUNK), mN + CHUNK), 2, mN + CHUNK);
    }
    return mGenFun.coeff(mN);
  }
}
