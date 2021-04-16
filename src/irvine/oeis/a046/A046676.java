package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046676 Expansion of 1 + Sum_{k&gt;=1} x^(p_1+p_2+...+p_k)/((1-x)*(1-x^2)*(1-x^3)*...*(1-x^k)) (where p_i are the primes).
 * @author Sean A. Irvine
 */
public class A046676 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.one();
    Polynomial<Z> prod = RING.one();
    int p = 2;
    int sp = 0;
    for (int k = 1; p <= mN; ++k, p = (int) mPrime.nextPrime(p)) {
      sp += p;
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      sum = RING.add(sum, RING.series(RING.monomial(Z.ONE, sp), prod, mN));
    }
    return sum.coeff(mN);
  }
}
