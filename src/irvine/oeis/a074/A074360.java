package irvine.oeis.a074;

import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074360 Coefficient of q^3 in nu(n), where nu(0)=1, nu(1)=b and, for n&gt;=2, nu(n)=b*nu(n-1)+lambda*(1+q+q^2+...+q^(n-2))*nu(n-2) with (b,lambda)=(2,2).
 * @author Sean A. Irvine
 */
public class A074360 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private Polynomial<Z> mB = Polynomial.create(2);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z[] q = new Z[mN - 1];
      Arrays.fill(q, Z.TWO);
      final Polynomial<Z> t = RING.add(RING.multiply(mB, Z.TWO), RING.multiply(Polynomial.create(q), mA));
      mA = mB;
      mB = t;
    }
    return mB.coeff(3);
  }
}
