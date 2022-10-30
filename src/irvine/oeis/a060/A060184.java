package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.DistinctPartsPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060184.
 * @author Sean A. Irvine
 */
public class A060184 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  private Polynomial<Z> contribution(final int n, final int max, final int k) {
    Polynomial<Z> sum = RING.zero();
    final DistinctPartsPartition part = new DistinctPartsPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length == k) {
        Polynomial<Z> prod = RING.one();
        for (final int v : p) {
          prod = RING.multiply(prod, RING.onePlusXToTheN(v), max);
        }
        sum = RING.add(sum, RING.series(RING.one(), prod, max - n).shift(n));
      }
    }
    return sum;
  }

  protected Polynomial<Z> getGf(final int n, final int k) {
    Polynomial<Z> sum = RING.zero();
    for (int j = 1; j <= n; ++j) {
      sum = RING.add(sum, contribution(j, n, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = (IntegerUtils.sqrt(8 * mN + 1) - 1) / 2;
    }
    return getGf(mN, mM).coeff(mN);
  }
}
