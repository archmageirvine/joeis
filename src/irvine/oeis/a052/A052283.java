package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A052283 Triangle read by rows: T(n,k) is the number of unlabeled directed graphs on n nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A052283 extends A052107 {

  /** Construct the sequence. */
  public A052283() {
    super(0);
  }

  // After Andrew Howroyd

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mRow = RING.zero();
  protected int mK = -1;
  protected int mM = 0;

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

  protected Polynomial<Z> g(final int n) {
    Polynomial<Z> row = RING.zero();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      row = RING.add(row, RING.multiply(edgesPoly(p), IntegerPartition.permCount(p, 1)));
    }
    return RING.divide(row, mF.factorial(n));
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mK <= 1) {
        return Z.ONE;
      }
      mRow = g(mK);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
