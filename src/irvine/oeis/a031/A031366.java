package irvine.oeis.a031;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Dirichlet;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a035.A035187;

/**
 * A031366 Expansion of Dirichlet series related to the ring of icosians.
 * @author Sean A. Irvine
 */
public class A031366 implements Sequence {

  // After R. J. Mathar

  private final MemorySequence mL1 = MemorySequence.cachedSequence(new PrependSequence(new A035187(), Z.ZERO));

  private List<Z> mDirichlet = null;
  private int mN = 0;
  private int mMaxOrd = 1;

  private List<Z> l1i2(final List<Z> l1i) {
    final List<Z> l1i2 = new ArrayList<>();
    l1i2.add(Z.ZERO);
    l1i2.add(Z.ONE);
    for (int k = 1; k < l1i.size(); ++k) {
      l1i2.add(Z.ZERO);
    }
    for (int k = 2; k * k < l1i2.size(); ++k) {
      l1i2.set(k * k, l1i.get(k));
    }
    return l1i2;
  }

  @Override
  public Z next() {
    if (++mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd =  2 * mN;
      mL1.a(mMaxOrd); // force computation of underlying series
      final List<Z> l1Shift = Dirichlet.shift(mL1);
      final List<Z> l1i = Dirichlet.inverse(mL1);
      final List<Z> l1i2 = l1i2(l1i);
      final List<Z> phi = Dirichlet.dirichletProduct(Dirichlet.dirichletProduct(mL1, l1Shift), l1i2);
      final List<Z> phiShift = Dirichlet.shift(phi);
      mDirichlet = Dirichlet.dirichletProduct(phi, phiShift);
    }
    return mDirichlet.get(mN);
  }
}
