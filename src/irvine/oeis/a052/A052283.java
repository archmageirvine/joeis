package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.group.PolynomialRing;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A052283 Triangle read by rows: T(n,k) is the number of unlabeled directed graphs on n nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A052283 extends A052107 {

  // After Andrew Howroyd

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mRow = RING.zero();
  private int mN = -1;
  private int mM = 0;

  private Polynomial<Z> edgesPoly(final int[] v) {
    Polynomial<Z> prod = RING.one();
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = IntegerUtils.gcd(v[i], v[j]);
        prod = RING.multiply(prod, RING.pow(RING.onePlusXToTheN(v[i] * v[j] / g), 2L * g));
      }
    }
    for (final int j : v) {
      prod = RING.multiply(prod, RING.pow(RING.onePlusXToTheN(j), j - 1));
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mN <= 1) {
        return Z.ONE;
      }
      mRow = RING.zero();
      final IntegerPartition part = new IntegerPartition(mN);
      int[] p;
      while ((p = part.next()) != null) {
        mRow = RING.add(mRow, RING.multiply(edgesPoly(p), permCount(p, 1)));
      }
      mM = 0;
    }
    return mRow.coeff(mM).divide(mF.factorial(mN));
  }
}
