package irvine.oeis.a075;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075565.
 * @author Sean A. Irvine
 */
public class A075793 extends A000040 {

  private static final Polynomial<Z> P = Polynomial.create(1296, 432, 108, 24, 5, 1);

  private boolean hasLinearFactor(final PolynomialRingField<Z> ring, final Polynomial<Z> poly, final Z lo, final Z hi) {
    for (Z d = lo; d.compareTo(hi) < 0; d = d.add(1)) {
      if (ring.eval(poly, d).isZero()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final PolynomialRingField<Z> ring = new PolynomialRingField<>(new GaloisField(p));
      for (Z a = Z.ONE; a.compareTo(p) < 0; a = a.add(1)) {
        if (ring.eval(P, a).isZero()) {
          final Polynomial<Z> q = ring.divide(P, Polynomial.create(a.negate(), Z.ONE));
          for (Z b = a; b.compareTo(p) < 0; b = b.add(1)) {
            if (ring.eval(q, b).isZero()) {
              final Polynomial<Z> r = ring.divide(q, Polynomial.create(b.negate(), Z.ONE));
              for (Z c = b; c.compareTo(p) < 0; c = c.add(1)) {
                if (ring.eval(r, c).isZero()) {
                  final Polynomial<Z> s = ring.divide(r, Polynomial.create(c.negate(), Z.ONE));
                  if (!hasLinearFactor(ring, s, c, p)) {
                    return p;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

