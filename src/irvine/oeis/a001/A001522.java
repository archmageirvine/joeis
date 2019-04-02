package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001522 Number of n-stacks with strictly receding walls, or planar partitions of n.
 * @author Sean A. Irvine
 */
public class A001522 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN = -1;

  protected Polynomial<Z> prod(final int n) {
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= n; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), n);
    }
    return p;
  }

  protected Polynomial<Z> sum(final int n) {
    Polynomial<Z> s = RING.zero();
    int k = 1;
    while (true) {
      final int u = k * (k + 1) / 2;
      if (u > n) {
        break;
      }
      s = RING.add(s, RING.monomial((k & 1) == 0 ? Z.NEG_ONE : Z.ONE, u));
      ++k;
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return RING.coeff(sum(mN), prod(mN), mN);
  }
}
