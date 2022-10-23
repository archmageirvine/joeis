package irvine.oeis.a059;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059819 Expansion of series related to Liouville's Last Theorem: g.f. Sum_{t&gt;0} (-1)^(t+1) *x^(t*(t+1)/2) / ( (1-x^t)^2 *Product_{i=1..t} (1-x^i) ).
 * @author Sean A. Irvine
 */
public class A059819 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final int mM;
  private int mN = -1;

  protected A059819(final int m) {
    mM = m;
  }

  /** Construct the sequence. */
  public A059819() {
    this(2);
  }

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k * (k + 1) / 2 <= mN; ++k) {
      final int u = mN - k * (k + 1) / 2;
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      final Polynomial<Z> t = RING.series(RING.one(), RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(k), mM, u), u), u);
      res = res.signedAdd((k & 1) == 1, t.coeff(u));
    }
    return res;
  }
}
