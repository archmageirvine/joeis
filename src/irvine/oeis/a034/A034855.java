package irvine.oeis.a034;

import java.util.ArrayList;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034855.
 * @author Sean A. Irvine
 */
public class A034855 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  protected final MemoryFactorial mF = new MemoryFactorial();
  private final ArrayList<Polynomial<Q>> mGF = new ArrayList<>();
  {
    mGF.add(RING.x());
  }

  protected Polynomial<Q> gf(final int k, final int n) {
    if (k <= 0) {
      return RING.x();
    } else if (mGF.size() > k && mGF.get(k).degree() >= n) {
      return mGF.get(k);
    } else {
      final Polynomial<Q> g = RING.exp(gf(k - 1, n - 1), n - 1).shift(1);
      if (k < mGF.size()) {
        mGF.set(k, g);
      } else {
        mGF.add(g);
      }
      return g;
    }
  }

  private Z a(final int n, final int k) {
    final Q c = gf(k, n).coeff(n);
    return c.multiply(mF.factorial(n)).toZ();
  }

  protected Z r(final int n, final int d) {
    return a(n, d).subtract(a(n, d - 1));
  }

  private int mN = 1;
  private int mD = 0;

  @Override
  public Z next() {
    if (++mD >= mN) {
      ++mN;
      mD = 1;
    }
    return r(mN, mD);
  }
}
