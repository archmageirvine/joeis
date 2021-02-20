package irvine.oeis.a031;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a035.A035187;

/**
 * A031366 Number of symmetrically inequivalent coincidence rotations of icosian ring of index n.
 * @author Sean A. Irvine
 */
public class A031366 implements Sequence {

  // After R. J. Mathar

  private final MemorySequence mL1 = MemorySequence.cachedSequence(new PrependSequence(new A035187(), Z.ZERO));

  private DirichletSeries mDirichlet = null;
  private int mN = 0;
  private int mMaxOrd = 1;

  @Override
  public Z next() {
    if (++mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd =  2 * mN;
      mL1.a(mMaxOrd); // force computation of underlying series
      final DirichletSeries l1 = DirichletSeries.fromList(mL1);
      final DirichletSeries l1Shift = l1.shift();
      final DirichletSeries l1i = l1.inverse(mMaxOrd);
      final DirichletSeries l1i2 = l1i.scale(2, mMaxOrd);
      final DirichletSeries phi = l1.multiply(l1Shift, mMaxOrd).multiply(l1i2, mMaxOrd);
      final DirichletSeries phiShift = phi.shift();
      mDirichlet = phi.multiply(phiShift, mMaxOrd);
    }
    return mDirichlet.coeff(mN);
  }
}
