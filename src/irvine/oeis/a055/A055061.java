package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055061 LCM of (2^d - 1) where d runs over the degrees of irreducible factors of x^n + x + 1 over GF(2), divided by A046932(n).
 * @author Sean A. Irvine
 */
public class A055061 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(1);
  private int mN = 1;

  protected List<Polynomial<Z>> factor(Polynomial<Z> f) {
    final List<Polynomial<Z>> res = new ArrayList<>();
    final Iterator<Polynomial<Z>> pi = IrreduciblePolynomials.iterator();
    while (true) {
      final Polynomial<Z> p = pi.next();
      while (IrreduciblePolynomials.exactlyDivides(f, p)) {
        f = RING.divide(f, p);
        res.add(p);
      }
      if (p.degree() > f.degree()) {
        break;
      }
    }
    return res;
  }

  protected Z periodIrreducible(final Polynomial<Z> p) {
    // p is assumed to be irreducible here
    final Z u = Z.ONE.shiftLeft(p.degree()).subtract(1);
    for (final Z d : Jaguar.factor(u).divisorsSorted()) {
      if (RING.zero().equals(RING.mod(RING.oneMinusXToTheN(d.intValueExact()), p))) {
        return d;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    final long[] c = new long[++mN + 1];
    c[0] = 1;
    c[1] = 1;
    c[mN] = 1;
    final Polynomial<Z> f = Polynomial.create(c);
    final List<Polynomial<Z>> factors = factor(f);
    Z per = Z.ONE;
    Z lcm = Z.ONE;
    for (final Polynomial<Z> p : factors) {
      lcm = lcm.lcm(Z.ONE.shiftLeft(p.degree()).subtract(1));
      per = per.lcm(periodIrreducible(p));
    }
    //System.out.println(factors.size() + " " + factors + " " + per);
    return lcm.divide(per);
  }
}
