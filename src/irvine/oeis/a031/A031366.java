package irvine.oeis.a031;

import java.util.List;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.dirichlet.FiniteDs;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035187;
import irvine.oeis.memory.MemorySequence;

/**
 * A031366 Number of symmetrically inequivalent coincidence rotations of icosian ring of index n.
 * @author Sean A. Irvine
 */
public class A031366 extends Sequence1 {

  // After R. J. Mathar

  private final MemorySequence mL1 = MemorySequence.cachedSequence(new PrependSequence(new A035187(), Z.ZERO));

  private Ds mDirichlet = null;
  private int mN = 0;
  private int mMaxOrd = 1;

  private Ds fromList(final List<Z> lst) {
    final FiniteDs ds = Dgf.empty();
    int k = -1;
    for (final Z v : lst) {
      ++k;
      if (!v.isZero()) {
        ds.put(Z.valueOf(k), v);
      }
    }
    return ds;
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  // WARNING: This is not a general purpose inverse -- not the same as Dgf.inverse()
  private Ds inverse(final Ds f, final int maxDegree) {
    final Polynomial<Z> series = Dgf.toPoly(f, maxDegree);
    final Polynomial<Z> inverse = RING.series(RING.one(), series.shift(-1), series.size() - 1).shift(1);
    final FiniteDs ds = Dgf.empty();
    for (int k = 0; k < inverse.size(); ++k) {
      if (!inverse.coeff(k).isZero()) {
        ds.put(Z.valueOf(k), inverse.coeff(k));
      }
    }
    return ds;
  }

  @Override
  public Z next() {
    if (++mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      mL1.a(mMaxOrd); // force computation of underlying series
      final Ds l1 = fromList(mL1.toList());
      final Ds l1Shift = Dgf.shift(l1, 1);
      final Ds l1i2 = Dgf.substitute(inverse(l1, mMaxOrd), 2);
      final Ds phi = Dgf.multiply(Dgf.multiply(l1, l1Shift), l1i2);
      mDirichlet = Dgf.multiply(phi, Dgf.shift(phi, 1));
    }
    return mDirichlet.coeff(mN);
  }
}
