package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006344 Number of rooted maps with n edges on Klein bottle.
 * @author Sean A. Irvine
 */
public class A006344 extends Sequence2 {

  private static final PolynomialRingField<CR> RING = new PolynomialRingField<>(ComputableReals.SINGLETON);
  private static final CR TWELVE = CR.valueOf(12);
  private static final Polynomial<CR> S = RING.create(Arrays.asList(TWELVE, CR.valueOf(-16), CR.FIVE));
  private static final Polynomial<CR> M = RING.create(Arrays.asList(CR.THREE.negate(), CR.TWO));
  private static final Polynomial<CR> A = RING.create(Arrays.asList(TWELVE, CR.valueOf(-17), CR.SIX));
  private static final Polynomial<CR> D = RING.create(Arrays.asList(CR.valueOf(72), CR.valueOf(-156), CR.valueOf(110), CR.valueOf(-25)));
  private static final Polynomial<CR> F = RING.monomial(CR.FIVE, 0);
  private static final Polynomial<CR> E = RING.create(Arrays.asList(CR.FOUR, CR.TWO));
  private int mN = 1;

  // (5-sqrt(1-12*z))/(2*(z+2)) [from z = (V-1)(3-2V)/V^2]
  private Polynomial<CR> a(final int n) {
    final Polynomial<CR> sqrt = RING.sqrt1m(RING.monomial(TWELVE, 1), n);
    return RING.series(RING.subtract(F, sqrt), E, n);
  }

  private Polynomial<CR> s(final Polynomial<CR> p, final Polynomial<CR> v, final int n) {
    return RING.substitute(p, v, n);
  }

  // B:=V->2*V*(6*V^2-17*V+12+(2*V-3)*sqrt((5*V-6)*(V-2)))/((5*V-6)^2*(2-V));
  private Polynomial<CR> b(final Polynomial<CR> a, final int n) {
    // Substitute polynomial "a" in for V, then expand as a series
    final Polynomial<CR> y = s(S, a, n);
    final Polynomial<CR> sqrt = RING.sqrt(y, n);
    return RING.series(RING.multiply(RING.multiply(RING.add(s(A, a, n), RING.multiply(sqrt, s(M, a, n), n)), a, n), CR.TWO), s(D, a, n), n);
  }

  @Override
  public Z next() {
    ++mN;
    final Polynomial<CR> a = a(mN);
    //System.out.println("ba=" + b(a, mN));
    return b(a, mN).coeff(mN).toZ();
  }
}

