package irvine.oeis.a046;

import java.util.List;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a055.A055061;

/**
 * A046932 a(n) = period of x^n + x + 1 over GF(2), i.e., the smallest integer m&gt;0 such that x^n + x + 1 divides x^m + 1 over GF(2).
 * @author Sean A. Irvine
 */
public class A046932 extends A055061 implements DirectSequence {

  /** Construct the sequence. */
  public A046932() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    final long[] c = new long[n + 1];
    c[0] = 1;
    c[1] = 1;
    c[n] = 1;
    final Polynomial<Z> f = Polynomial.create(c);
    final List<Polynomial<Z>> factors = factor(f);
    Z per = Z.ONE;
    for (final Polynomial<Z> p : factors) {
      per = per.lcm(periodIrreducible(p));
    }
    return per;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
