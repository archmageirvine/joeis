package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005283 Number of permutations of <code>(1,...,n)</code> having <code>n-5</code> inversions <code>(n&gt;=5)</code>.
 * @author Sean A. Irvine
 */
public class A005283 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = RING.oneMinusXToTheN(1);
  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 2; k <= mN; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k));
    }
    return RING.coeff(p, RING.pow(DEN, mN - 1), mN - 5);
  }
}

