package irvine.oeis.a046;

import java.util.List;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a055.A055061;

/**
 * A046932 a(n) = period of x^n + x + 1 over GF(2), i.e., the smallest integer m&gt;0 such that x^n + x + 1 divides x^m + 1 over GF(2).
 * @author Sean A. Irvine
 */
public class A046932 extends A055061 {

  private int mN = 0;

  @Override
  public Z next() {
    final long[] c = new long[++mN + 1];
    c[0] = 1;
    c[1] = 1;
    c[mN] = 1;
    final Polynomial<Z> f = Polynomial.create(c);
    final List<Polynomial<Z>> factors = factor(f);
    Z per = Z.ONE;
    for (final Polynomial<Z> p : factors) {
      per = per.lcm(periodIrreducible(p));
    }
    return per;
  }
}
