package irvine.oeis.a014;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a010.A010054;

/**
 * A014787 Expansion of Jacobi theta constant (theta_2/2)^12.
 * @author Sean A. Irvine
 */
public class A014787 extends A010054 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private final Polynomial<Z> mGf = Polynomial.create(new long[0]);
  private int mN = -1;

  protected int power() {
    return 12;
  }

  @Override
  public Z next() {
    mGf.add(super.next());
    return RING.pow(mGf, power(), ++mN).coeff(mN);
  }
}
