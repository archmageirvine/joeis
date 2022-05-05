package irvine.oeis.a056;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A056679 Primes p such that 1 + x + Sum_{q prime &lt;= p} x^q is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A056679 extends A000040 {

  private final Polynomial<Z> mA = Polynomial.create(1, 1);

  @Override
  public Z next() {
    while (true) {
      final Z pz = super.next();
      final int p = pz.intValueExact();
      while (mA.degree() < p - 1) {
        mA.add(Z.ZERO);
      }
      mA.add(Z.ONE);
      final Iterator<Polynomial<Z>> irr = IrreduciblePolynomials.iterator();
      while (true) {
        final Polynomial<Z> i = irr.next();
        if (i.equals(mA)) {
          return pz;
        }
        if (i.degree() > mA.degree()) {
          throw new RuntimeException();
        }
        if (IrreduciblePolynomials.exactlyDivides(mA, i)) {
          break; // definitely not irreducible
        }
      }
    }
  }
}
