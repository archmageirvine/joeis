package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001935 Number of partitions with no even part repeated; partitions of n in which no parts are multiples of 4.
 * @author Sean A. Irvine
 */
public class A001935 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      gf = RING.multiply(gf, RING.pow(RING.onePlusXToTheN(k), 2 - (k & 1), mN), mN);
    }
    return gf.coeff(mN);
  }
}

