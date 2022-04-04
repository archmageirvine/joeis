package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.MemoryFunction;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A005489 Number of nonzero coefficients of order n in Baker-Campbell-Hausdorff expansion.
 * @author Sean A. Irvine
 */
public class A005489 extends MemoryFunction<Integer, Polynomial<Q>> implements Sequence {

  // After Andrey Zabolotskiy

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.NEG_ONE, Q.TWO));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, Q.ONE));
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  protected Polynomial<Q> compute(final Integer s) {
    if (s == 1) {
      return RING.one();
    }
    return RING.add(
      RING.multiply(getValue(s - 1), C1),
      RING.multiply(C2, RING.diff(getValue(s - 1)))
    );
  }

  private Q cx(final int[] ss) {
    final int m = ss.length + 1;
    final int mp = m / 2;
    Polynomial<Q> gamma = RING.one();
    for (final int s : ss) {
      gamma = RING.multiply(gamma, getValue(s));
    }
    Q sum = Q.ZERO;
    for (int k = 0; k < gamma.size(); ++k) {
      sum = sum.add(gamma.coeff(k).multiply(mF.factorial(mp + k)).divide(mF.factorial(m + k)));
    }
    // Strictly there should be a multiplier applied to the sum as below, but
    // because we only care if the sum if 0 and the multiplier is never 0, then
    // we do not need to compute it.
    return sum;
//    final int mpp = (m - 1) / 2;
//    Q multiplier = new Q(mF.factorial(mpp));
//    for (final int s : ss) {
//      multiplier = multiplier.divide(mF.factorial(s));
//    }
//    final Q sm = sum.multiply(multiplier);
//    return (mpp & 1) == 0 ? sm : sm.negate();
  }

  private long per(final int[] p) {
    final Permutation perm = new Permutation(p);
    long c = 0;
    while (perm.next() != null) {
      ++c;
    }
    return c;
  }

  private Z cxs(final int n) {
    final IntegerPartition part = new IntegerPartition(n - 1);
    int[] p;
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      final Q cx = cx(p);
      if (!Q.ZERO.equals(cx)) {
        sum = sum.add(per(p));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return cxs(mN);
  }
}
