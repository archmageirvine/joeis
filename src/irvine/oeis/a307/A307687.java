package irvine.oeis.a307;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence1;

/**
 * A307687 a(n) is the first prime value of the n-th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A307687 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> cp = Cyclotomic.cyclotomic(++mN);
    long m = 0;
    while (true) {
      final Z v = RING.eval(cp, Z.valueOf(++m));
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}
