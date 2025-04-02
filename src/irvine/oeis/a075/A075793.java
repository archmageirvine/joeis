package irvine.oeis.a075;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A075793 Primes p such that f_p(x)=(1296+432*x+108*x^2+24*x^3+5*x^4+x^5) mod p factors as product of 3 linear and one irreducible quadratic factor.
 * @author Sean A. Irvine
 */
public class A075793 extends Sequence1 {

  private final A000040 mSeq = new A000040();
  private static final Polynomial<Z> P = Polynomial.create(1296, 432, 108, 24, 5, 1);

  private boolean hasLinearFactor(final PolynomialRingField<Z> ring, final Polynomial<Z> poly, final Z lo, final Z hi) {
    for (Z d = lo; d.compareTo(hi) < 0; d = d.add(1)) {
      if (ring.eval(poly, d).isZero()) {
        return true;
      }
    }
    return false;
  }

  /* 947 is not member because:
   * > R<x>:=PolynomialRing(GaloisField(947));
   * > Factorization(R!1296+432*x+108*x^2+24*x^3+5*x^4+x^5);
   * [<x + 7, 1>,<x + 382, 1>,<x + 740, 1>,<x + 805, 1>,<x + 912, 1>]
   */

  @Override
  public Z next() {
    while (true) {
      final Z p = mSeq.next();
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
                  if (!hasLinearFactor(ring, s, Z.ONE, p)) { // Z.ONE should be c, but for some reason that allows p=947 to pass
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

