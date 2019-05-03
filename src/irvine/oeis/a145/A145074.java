package irvine.oeis.a145;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A145074 Coefficient of <code>x^(4^n)</code> in <code>Q(x)^(n+1)</code> where <code>Q(x) = Sum_{k&gt;=0} (x^(4^k) + x^(2*4^k) + x^(3*4^k))</code>.
 * @author Sean A. Irvine
 */
public class A145074 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  private Polynomial<Z> q(final int n) {
    final long[] raw = new long[3 * (1 << (2 * n)) + 1];
    for (int k = 0; k <= n; ++k) {
      final int v = 1 << (2 * k);
      raw[v]++;
      raw[2 * v]++;
      raw[3 * v]++;
    }
    return Polynomial.create(raw);
  }

  @Override
  public Z next() {
    ++mN;
    final int coeffIndex = 1 << (2 * mN);
    return RING.pow(q(mN), mN + 1, coeffIndex).coeff(coeffIndex);
  }

}

