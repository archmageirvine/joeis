package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A002040 Related to partitions.
 * @author Sean A. Irvine
 */
public class A002040 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  private Polynomial<Z> f(final int n) {
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= n; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), n);
    }
    return p;
  }

  private Polynomial<Z> fn(final Polynomial<Z> p) {
    final ArrayList<Z> c = new ArrayList<>();
    for (int k = 0; k <= p.degree(); ++k) {
      c.add((k & 1) == 0 ? p.coeff(k) : p.coeff(k).negate());
    }
    return RING.create(c);
  }

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.one(), RING.diff(fn(f(mN + 1))), mN);
  }
}
