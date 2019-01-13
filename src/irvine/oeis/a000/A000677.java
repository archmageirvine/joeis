package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A000677.
 * @author Sean A. Irvine
 */
public class A000677 implements Sequence, Serializable {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 0, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1);

  private int mN = -1;
  private Polynomial<Z> mPoly = null;
  private int mLim = 1;

  private Polynomial<Z> munch(final int m) {
    final ArrayList<Polynomial<Z>> rr = new ArrayList<>();
    rr.add(RING.x());
    rr.add(RING.series(NUM, DEN, m));

    final Z[] r = new Z[m];
    Z[] s = new Z[m];
    Arrays.fill(s, Z.ONE);
    Arrays.fill(r, Z.ONE);
    r[0] = Z.ZERO;
    for (int h = 1; h < m; ++h) {
      final EulerTransformSequence et = new EulerTransformSequence(new FiniteSequence(s), 0);
      final Z[] b = new Z[m];
      for (int k = 0; k < m; ++k) {
        b[k] = et.next();
      }
      for (int n = 0; n < m; ++n) {
        r[n] = b[n].subtract(s[n]);
      }
      s = b;
      rr.add(RING.shift(RING.create(Arrays.asList(r)), 1));
    }
    Polynomial<Z> t1 = RING.zero();
    for (final Polynomial<Z> p : rr) {
      t1 = RING.add(t1, RING.add(RING.pow(p, 2, m), p.substitutePower(2)));
    }
    return t1;
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    if (mN > mLim) {
      mLim *= 2;
      mPoly = munch(mLim);
    }
    return mPoly.coeff(mN).divide(2);
  }
}
