package irvine.oeis.a057;

import java.util.Iterator;

import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057486 Numbers n such that x^n + x^m + 1 is factorable over GF(2) for all m between 1 and n.
 * @author Sean A. Irvine
 */
public class A057486 extends Sequence1 {

  // This is very slow...

  private int mN = 7;

  private final Iterator<Polynomial<Z>> mIterator = IrreduciblePolynomials.iterator();

  private boolean isTrinomial(final Polynomial<Z> p) {
    int cnt = 0;
    for (final Z c : p) {
      if (!c.isZero() && ++cnt > 3) {
        return false;
      }
    }
    return cnt == 3;
  }

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> irr = mIterator.next();
      if (irr.degree() > mN) {
        // We made it all the way through without seeing an irreducible
        return Z.valueOf(mN++);
      }
      if (isTrinomial(irr)) {
        mN = irr.degree() + 1; // x^n+x^m+1 is irreducible for some m
      }
    }
  }
}
