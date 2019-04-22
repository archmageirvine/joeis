package irvine.oeis.a307;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A307687 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A307687 implements Sequence {

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
