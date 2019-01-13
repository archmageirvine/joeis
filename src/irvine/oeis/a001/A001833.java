package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001833.
 * @author Sean A. Irvine
 */
public class A001833 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();
  private final ArrayList<ArrayList<Q>> mCCoeff = new ArrayList<>();

  private Polynomial<Q> cPoly(final int h, final int n) {
    while (h >= mCCoeff.size()) {
      mCCoeff.add(new ArrayList<>());
    }
    final ArrayList<Q> cp = mCCoeff.get(h);
    while (n >= cp.size()) {
      final int m = cp.size();
      cp.add(new Q(A001827.c(h, m), mF.factorial(m)));
    }
    return RING.create(cp);
  }

  // Eq. 7 in Klarner, note the approach in Eq. 10 does not seem to work
  Z b(final int h, final int n) {
    if (h <= 1 || n <= 1) {
      return Z.ONE;
    }
    return RING.coeff(cPoly(h, n), cPoly(h - 1, n), n).multiply(mF.factorial(n)).toZ();
  }

  @Override
  public Z next() {
    ++mN;
    return b(mN, mN);
  }
}
