package irvine.oeis.a392;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392387 Nullspace dimension of the periodic XX Heisenberg chain with n &gt; 1 sites.
 * @author Sean A. Irvine
 */
public class A392387 extends Sequence2 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final double INITIAL_PRECISION = 1E-6;
  //private static final int CR_PRECISION = -100;
  private int mN = 1;
  private Polynomial<Z> mCyclotomicPoly = null;

  private boolean isDouble(final long k) {
    double sum = 0;
    final int sk = (Long.bitCount(k) & 1) == 0 ? 1 : 0;
    for (int j = 0; j < mN; ++j) {
      if ((k & (1L << j)) != 0) { // j in k
        final int t = 2 * (j + 1) + sk; // 2j + (1+(-1)^|K|)/2
        final double cos = Math.cos(Math.PI * t / mN);
        sum += cos;
      }
    }
    return Math.abs(sum) < INITIAL_PRECISION;
  }

  // CR version
//  private boolean is(final long k) {
//    if (!isDouble(k)) {
//      return false;
//    }
//    CR sum = CR.ZERO;
//    final int sk = (Long.bitCount(k) & 1) == 0 ? 1 : 0;
//    for (int j = 0; j < mN; ++j) {
//      if ((k & (1L << j)) != 0) { // j in k
//        final int t = 2 * (j + 1) + sk; // 2j + (1+(-1)^|K|)/2
//        final CR cos = CR.PI.multiply(t).divide(mN).cos();
//        sum = sum.add(cos);
//      }
//    }
//    return sum.compareTo(CR.ZERO, CR_PRECISION) == 0;
//  }

  private boolean is2(final long k) {
    // Do an initial floating-point test
    if (!isDouble(k)) {
      return false;
    }
    // Exact computation
    final long[] coeffs = new long[4 * mN + 3];
    final int sk = (Long.bitCount(k) & 1) == 0 ? 1 : 0;
    final int offset = 2 * mN + 1;
    for (int j = 0; j < mN; ++j) {
      if ((k & (1L << j)) != 0) { // j in k
        final int t = 2 * (j + 1) + sk; // 2j + (1+(-1)^|K|)/2
        ++coeffs[offset + t];
        ++coeffs[offset - t];
      }
    }
    return RING.isZero(RING.mod(Polynomial.create(coeffs), mCyclotomicPoly));
  }

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      return Z.TWO;
    }
    mCyclotomicPoly = CyclotomicPolynomials.cyclotomic(2 * mN);
    long count = 0;
    for (long k = 0; k < 1L << mN; ++k) {
      if (is2(k)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
