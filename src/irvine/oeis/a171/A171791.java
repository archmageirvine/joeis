package irvine.oeis.a171;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A171791 G.f. A(x) satisfies: [x^n] A(x)^((n+1)^2) = 0 for n&gt;1 with a(0)=a(1)=1.
 * @author Sean A. Irvine
 */
public class A171791 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      mA.add(Z.ONE);
    } else {
      final Polynomial<Z> p = RING.create(mA);
      final int n2 = mN * mN;
      final Polynomial<Z> pp = RING.pow(p, n2, mN - 1);
      final Z t = pp.coeff(mN - 1).divide(n2).negate();
      mA.add(t);
    }
    return mA.get(mN - 1);
  }
}
