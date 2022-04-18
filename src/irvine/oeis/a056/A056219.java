package irvine.oeis.a056;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056219 Number of partitions of n in SPM(n): these are the partitions obtained from (n) by iteration of the following transformation: p -&gt; p' if p' is a partition (i.e., decreasing) and p' is obtained from p by removing a unit from the i-th component of p and adding one to the (i+1)-th component, for any i.
 * @author Sean A. Irvine
 */
public class A056219 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Polynomial<Z> prod = RING.one();
    for (int j = 1; j * (j + 1) / 2 <= mN; ++j) {
      final Polynomial<Z> t = RING.add(RING.series(RING.one(), RING.oneMinusXToTheN(j), mN), RING.x());
      prod = RING.multiply(prod, t, mN);
      sum = sum.add(prod.shift(j * (j + 1) / 2).coeff(mN));
    }
    return sum;
  }
}
