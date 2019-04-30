package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003406 Expansion of Ramanujan's function <code>R(x) = 1 + Sum_{n &gt;= 1} { x^(n*(n+1)/2) / ((1+x)(1+x^2)(1+x^3)...(1+x^n)) }</code>.
 * @author Sean A. Irvine
 */
public class A003406 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;


  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ONE;
    }
    Polynomial<Z> prod = RING.one();
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      gf = RING.add(gf, RING.multiply(RING.monomial((k & 1) == 0 ? Z.ONE : Z.NEG_ONE, k), prod, mN));
    }
    return gf.coeff(mN);
  }
}
