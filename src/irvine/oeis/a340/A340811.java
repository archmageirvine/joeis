package irvine.oeis.a340;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A340811 Array read by antidiagonals: T(n,k) is the number of unlabeled k-gonal 2-trees with n polygons, n &gt;= 0, k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A340811 extends A340812 {

  private int mN = -1;
  private int mM = 0;

  private Polynomial<Z> p(final Polynomial<Z> p, final int k) {
    return p.substitutePower(k, p.degree());
  }

  private Polynomial<Z> shiftedEulerTransform(final Polynomial<Z> t) {
    final Polynomial<Z> res = RING.empty();
    final Sequence et = new EulerTransform(new SkipSequence(new FiniteSequence(t), 1), 1);
    for (int j = 0; j <= t.degree(); ++j) {
      res.add(et.next());
    }
    return res;
  }

  protected Polynomial<Z> s(final Polynomial<Z> p, final int k) {
    final int n = p.degree();
    final Polynomial<Z> p2 = p(p, 2);
    if ((k & 1) == 1) {
      // odd
      final Polynomial<Z> t = RING.add(RING.pow(p2, k / 2, n).shift(1), RING.divide(RING.subtract(RING.pow(p2, k - 1, n), RING.pow(p(p, 4), k / 2, n)), Z.TWO).shift(2));
      return shiftedEulerTransform(t);
    } else {
      // even
      final Polynomial<Z> r = RING.pow(p2, k / 2 - 1, n);
      Polynomial<Z> q = RING.one();
      for (int j = 0; j < n; ++j) {
        final Polynomial<Z> t = RING.multiply(r, q, n);
        final Polynomial<Z> u = RING.add(t.shift(1), RING.divide(RING.subtract(RING.pow(p, k - 1, n), t).substitutePower(2, n), Z.TWO).shift(2));
        q = shiftedEulerTransform(u);
      }
      return RING.add(q, RING.divide(RING.multiply(RING.pow(p2, k / 2 - 1, n), RING.subtract(p2, RING.pow(q, 2, n)), n), Z.TWO).shift(1));
    }
  }

  protected Polynomial<Z> u(final int n, final int k) {
    final Polynomial<Z> p = b(n, k);
//    System.out.println("c(" + n + "," + k + ")=" + c(p, n, k));
//    System.out.println("s(" + n + "," + k + ")=" + s(p, k));
    return RING.divide(RING.add(c(p, n, k), s(p, k)), Z.TWO);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return u(mM, mN - mM + 2).coeff(mM);
  }
}

