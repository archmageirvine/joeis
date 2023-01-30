package irvine.oeis.a039;

import irvine.math.group.PolynomialRing;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039754 Irregular triangle read by rows: T(n,k) = number of binary codes of length n with k words (n &gt;= 0, 0 &lt;= k &lt;= 2^n); also number of 0/1-polytopes with vertices from the unit n-cube; also number of inequivalent Boolean functions of n variables with exactly k nonzero values under action of Jevons group.
 * @author Sean A. Irvine
 */
public class A039754 extends Sequence0 {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private Polynomial<Q> mA = new PolynomialRing<>(Rationals.SINGLETON).onePlusXToTheN(1);
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    final Z r = mA.coeff(++mM).toZ();
    if (r.isZero()) {
      mA = WreathExponentiation.exponentiation(Z2, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN();
      mM = 0;
      return Z.ONE;
    }
    return r;
  }
}

