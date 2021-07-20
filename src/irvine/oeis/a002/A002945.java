package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002945 Continued fraction for cube root of 2.
 * @author Sean A. Irvine
 */
public class A002945 implements Sequence {

  // Polynomial method for generating continued fractions
  // In this case <code>\sqrt[3]{2}</code> initial polynomial is x^3-2=0
  // More generally:
  // Leading coefficient must be positive.
  // A unique simple zero alpha>1
  // All other zeros in the left half of unit circle

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mF = initialPoly();

  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-2, 0, 0, 1);
  }

  private Z findMax(final Polynomial<Z> f) {
    // Initial estimate based on properties of polynomial
    Z a = f.coeff(f.degree() - 1).divide(f.coeff(f.degree())).negate();
    //Z a = Z.ONE;
    while (RING.eval(f, a).signum() < 0) {
      a = a.add(1);
    }
    return a.subtract(1);
  }

  @Override
  public Z next() {
    // Find largest negative value
    final Z a = findMax(mF);
    final int d = mF.degree();
    // Compute g(x) = f(x + a)
    Polynomial<Z> g = RING.zero();
    final Polynomial<Z> arg = Polynomial.create(a, Z.ONE);
    for (int k = 0; k <= d; ++k) {
      g = RING.add(g, RING.multiply(RING.pow(arg, k), mF.coeff(k)));
    }
    // Compute h(x) = -x^d g(1/x)
    final ArrayList<Z> coeff = new ArrayList<>();
    for (int k = 0; k <= d; ++k) {
      coeff.add(g.coeff(d - k).negate());
    }
    mF = RING.create(coeff);
    return a;
  }
}
