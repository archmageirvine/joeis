package irvine.oeis.a391;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a386.A386606;

/**
 * A391716 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A391716 extends A386606 {

  private static final Z NEG_THREE = Z.valueOf(-3);

  private boolean is(final int n) {
    final Polynomial<Z> cp = CyclotomicPolynomials.cyclotomic(n);
    for (final Z c : cp) {
      if (c.abs().compareTo(Z.THREE) > 0) {
        return false;
      }
    }
    // todo this doesn't seem to be right
    boolean saw3 = false;
    boolean sawN3 = false;
    for (final Z c : cp) {
      saw3 |= c.equals(Z.THREE);
      sawN3 |= c.equals(NEG_THREE);
    }
    return saw3 && sawN3;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n.intValueExact())) {
        return n;
      }
    }
  }
}
