package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006023 Number of unlabeled mating digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A006023 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  private static long getPowersOfTwo(final int[] v) {
    long powersOfTwo = 0;
    for (int k = 1; k < v.length; ++k) {
      if (v[k] > 0) {
        powersOfTwo += (long) (k - 1) * v[k];
        powersOfTwo += (long) k * v[k] * (v[k] - 1);
        for (int j = k + 1; j < v.length; ++j) {
          powersOfTwo += 2 * Functions.GCD.l(j, k) * v[j] * v[k];
        }
      }
    }
    if (powersOfTwo > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return powersOfTwo;
  }

  private static Polynomial<Q> sum(final int vertices) {
    Polynomial<Q> sum = RING.zero();
    final IntegerPartition ip = new IntegerPartition(vertices);
    final int[] v = new int[vertices + 1];
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, v);
      Polynomial<Q> prod = RING.one();
      for (int k = 1; k <= vertices; ++k) {
        if (v[k] > 0) {
          prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(k), v[k]));
        }
      }
      final Q coeff = new Q(Z.ONE.shiftLeft(getPowersOfTwo(v)), SymmetricGroup.per(v));
      prod = RING.multiply(prod, coeff);
      sum = RING.add(sum, prod);
    }
    return sum;
  }

  private Polynomial<Q> mPoly = RING.zero();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Q> gf = sum(mN);
    mPoly = RING.add(mPoly, gf.shift(mN));
    return mPoly.coeff(mN).toZ();
  }
}
