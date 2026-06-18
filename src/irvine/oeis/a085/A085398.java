package irvine.oeis.a085;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085398 Let Cn(x) be the n-th cyclotomic polynomial; a(n) is the least k&gt;1 such that Cn(k) is prime.
 * @author Sean A. Irvine
 */
public class A085398 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private long mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> c = CyclotomicPolynomials.cyclotomic(++mN);
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (RING.eval(c, k).isProbablePrime()) {
        return k;
      }
    }
  }
}
